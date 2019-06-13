package com.spread.ydy.java8.chap03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionRef {

    public static void main(String[] args) {
        List<Integer> weights = Arrays.asList(7, 3, 4, 10);
        List<Apple> apples = map(weights, Apple::new);

        for (Apple apple : apples) {
            System.out.println(apple);
        }
    }

    public static List<Apple> map(List<Integer> list, Function<Integer, Apple> f) {
        List<Apple> result = new ArrayList<>();
        for (Integer e : list) {
            result.add(f.apply(e));
        }
        return result;
    }
}

class Apple {

    private int weight;

    public Apple(Integer i) {
        this.weight = i;
    }

    @Override
    public String toString() {
        return "Apple [weight=" + weight + "]";
    }
}