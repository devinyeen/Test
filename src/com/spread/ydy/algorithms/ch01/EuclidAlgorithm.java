package com.spread.ydy.algorithms.ch01;

import java.util.Scanner;

public class EuclidAlgorithm {
    public static int gcd(int p, int q) {
        if (q == 0)
            return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
//        System.out.println(p);
        int q = input.nextInt();
//        System.out.println(q);
        System.out.println(gcd(p,q));
    }
}
