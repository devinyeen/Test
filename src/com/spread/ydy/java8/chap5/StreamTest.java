package com.spread.ydy.java8.chap5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamTest {

    public static void main(String[] args) {
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4);
        Optional<Integer> firstSquareDivisibleByThree = 
                someNumbers.stream()
                .map(x->x*x)
                .filter(x->x%3 == 0)
                .findFirst();
        System.out.println(firstSquareDivisibleByThree);

        int sum = someNumbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        sum = someNumbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        Optional<Integer> sumO = someNumbers.stream().reduce(Integer::sum);
        System.out.println(sumO);
        sumO = someNumbers.stream().reduce(Integer::sum);
        System.out.println(sumO);
        sumO = someNumbers.stream().reduce((a, b) -> a + b);
        System.out.println(sumO);

        List<Integer> noNumbers = new ArrayList<>();
        sumO = noNumbers.stream().reduce((a, b) -> a + b);
        System.out.println(sumO);
    }

}
