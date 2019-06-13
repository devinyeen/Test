package com.spread.ydy.java8.chap06;

import static java.util.stream.Collectors.partitioningBy;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Primes {

    public static void main(String[] args) {

        long currentTime = System.currentTimeMillis();
        boolean isPrime = isPrime(999999991);
        long diff = System.currentTimeMillis() - currentTime;
        System.out.println(diff);
        System.out.println("------------------------------------------------------------");

        currentTime = System.currentTimeMillis();
        isPrime = isPrimeOpt(999999991);
        diff = System.currentTimeMillis() - currentTime;
        System.out.println(diff);
        System.out.println("------------------------------------------------------------");
        System.out.println(partitionPrimes(100));
        System.out.println("------------------------------------------------------------");
    }

    public static boolean isPrime(int candidate) {
        return IntStream.range(2, candidate).noneMatch(i -> candidate % i == 0);
    }

    public static boolean isPrimeOpt(int candidate) {
        int rootCandidate = (int) Math.sqrt((double) candidate);
        return IntStream.rangeClosed(2, rootCandidate).noneMatch(i -> candidate % i == 0);
    }

    public static Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n)
                .boxed()
                .collect(partitioningBy(candidate -> isPrimeOpt(candidate)));
    }

    public static <A> List<A> takeWhile(List<A> list, Predicate<A> p) {
        int i = 0;
        for (A item : list) {
            if (!p.test(item)) {
                return list.subList(0, i);
            }
            i++;
        }
        return list;
    }

    public static boolean isPrimeOptPrime(List<Integer> primes, int candidate) {
        int candidateRoot = (int) Math.sqrt((double) candidate);
        return takeWhile(primes, i -> i <= candidateRoot)
                .stream()
                .noneMatch(p -> candidate % p == 0);
    }
}
