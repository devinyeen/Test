package com.spread.ydy.java8.chap14;

public class LazyListTest {

    public static void main(String[] args) {
        LazyList<Integer> lazyList = from(2);
        Integer two = lazyList.head();
        Integer three = lazyList.tail().head();
        Integer four = lazyList.tail().tail().head();
        // 实时计算得出 2,3,4
        System.out.println(two + " " + three + " " + four);
        System.out.println("=================");
        LazyList<Integer> numbers = from(2);
        int two2 = primes(numbers).head();
        int three2 = primes(numbers).tail().head();
        int five2 = primes(numbers).tail().tail().head();
        System.out.println(two2 + " " + three2 + " " + five2);
        System.out.println("+++++++++++++++++++");
        printAll(primes(numbers));
    }

    public static <T> void printAll(MyList<T> list) {
        while (!list.isEmpty()) {
            System.out.println(list.head());
            list = list.tail();
        }
    }

    static <T> void printAll2(MyList<T> list) {
        if (list.isEmpty())
            return;
        System.out.println(list.head());
        printAll(list.tail());
    }

    /**
     * 质数筛选器
     * 
     * @param numbers
     * @return
     */
    public static MyList<Integer> primes(MyList<Integer> numbers) {
        return new LazyList<>(numbers.head(), () -> primes(numbers.tail().filter(n -> n % numbers.head() != 0)));
    }

    /**
     * 延迟列表
     * 
     * @param n
     * @return
     */
    public static LazyList<Integer> from(int n) {
        return new LazyList(n, () -> from(n + 1));
    }
}
