package com.spread.ydy.java8.chap03;

import java.util.function.Function;

/**
 * @author devin.yin
 *
 */
public class FunctionComposite {

    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;

        Function<Integer, Integer> h = f.andThen(g);
        System.out.println(h.apply(1));

        Function<Integer, Integer> i = f.compose(g);
        System.out.println(i.apply(1));

    }

}
