package com.spread.ydy.algorithms.ch01;

public class PrimeNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(isPrimeNumber(100));
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
