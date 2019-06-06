package com.spread.ydy.java8.chap7;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

//集成RecursiveTask用来创建可以用于分支/合并框架的任务
public class ForkJoinSumCalculator extends RecursiveTask<Long> {
    // 不再将任务分解为子任务的数组大小
    public static final long THRESHOLD = 10_000;
    // 需要求和的数组
    private final long[] numbers;
    // 子任务处理数组的起始和终止位置
    private final int start;
    private final int end;

    // 构造函数用于创建主任务
    public ForkJoinSumCalculator(long[] numbers) {
        this(numbers, 0, numbers.length);
    }

    // 用于递归方式为主任务创建子任务
    private ForkJoinSumCalculator(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    // 这里举一个用分支/合并 框架的实际例子，用这个框架为一个数字范围（这里用一个 long[]数组表示）求和
    @Override
    protected Long compute() {
        // 该任务用于求和的部分 的大小
        int length = end - start;
        // 小于阈值顺序计算结果
        if (length <= THRESHOLD) {
            return computeSequentially();
        }
        // 创建子任务为数组的前一半求和
        ForkJoinSumCalculator leftTask = new ForkJoinSumCalculator(numbers, start, start + length / 2);
        // 利用forkjoinpool线程异步执行新创建的子任务
        leftTask.fork();
        // 创建一个子任务用于为数组后半部分求和
        ForkJoinSumCalculator rightTask = new ForkJoinSumCalculator(numbers, start + length / 2, end);
        // 同步执行第二个子任务,有可能进一步进行递归划分
        Long rightResult = rightTask.compute();
        // 读取第一个子任务的执行结果,如果没有执行完成就等待
        Long leftResult = leftTask.join();
        // 该任务的结果是两个子任务的结果的组合
        return leftResult + rightResult;
    }

    private long computeSequentially() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    // 现在编写一个方法来并行对前n个自然数求和就很简单了。你只需把想要的数字数组传给 ForkJoinSumCalculator的构造函数
    public static long forkJoinSum(long n) {
        // 这里用了一个LongStream来生成包含前n个自然数的数组
        long[] numbers = LongStream.rangeClosed(1, n).toArray();
        // 然后创建一个ForkJoinTask （RecursiveTask的父类），并把数组传递给ForkJoinSumCalculator的公共构造函数
        ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
        // 创建了一个新的ForkJoinPool，并把任务传给它的调用方法 。在
        // ForkJoinPool中执行时，最后一个方法返回的值就是ForkJoinSumCalculator类定义的任务结果
        return new ForkJoinPool().invoke(task);
    }

    public static void main(String[] args) {
        System.out.println(forkJoinSum(100));
    }
}