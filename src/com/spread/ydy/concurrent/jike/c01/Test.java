package com.spread.ydy.concurrent.jike.c01;

public class Test {

    private long count = 0;

    private void add10k() {
        int idx = 0;
        while (idx++ < 10000) {
            count += 1;
        }
    }

    public static long calc() {
        final Test test = new Test();

        Thread th1 = new Thread(() -> {
            test.add10k();
        });

        Thread th2 = new Thread(() -> {
            test.add10k();
        });
        th1.start();
        th2.start();
        try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 结果为10000到20000的随机数
        return test.count;
    }

    public static void main(String[] args) {
        Test test = new Test();

        Thread th1 = new Thread(() -> {
            test.add10k();
        });

        Thread th2 = new Thread(() -> {
            test.add10k();
        });
        th1.start();
        th2.start();
        try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(test.count);
    }

}
