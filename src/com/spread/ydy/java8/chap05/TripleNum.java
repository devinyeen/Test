package com.spread.ydy.java8.chap05;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TripleNum {

    public static void main(String[] args) {
        Stream<int[]> triples = 
        IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a->IntStream.rangeClosed(a, 100)
                .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                .mapToObj(b -> new int[] { a, b, (int) Math.sqrt(a * a + b * b)}));
        triples
                .limit(5)
                .forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));

        System.out.println();
        Stream.iterate(0, n->n+2).limit(10).forEach(System.out::println);

        System.out.println();
//        Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[0], t[0] + t[1] }).limit(10)
//                .forEach(t -> System.out.println(t[0] + ", " + t[1]));
//        Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(10)
//        .forEach(t -> System.out.println(t[0] + ", " + t[1]));
        Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] })
                .limit(10)
                .map(t->t[0])
                .forEach(System.out::println);

        System.out.println();
        Stream.generate(Math::random)
            .limit(5)
            .forEach(System.out::println);
    }

}
