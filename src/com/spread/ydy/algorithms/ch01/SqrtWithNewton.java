package com.spread.ydy.algorithms.ch01;

public class SqrtWithNewton {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(sqrt(2));
        System.out.println(sqrt(3));
        System.out.println(sqrt(5));
        System.out.println(sqrt(7));
    }

    public static double sqrt(double n) {
        if (n < 0) return Double.NaN;
        double err = 1e-15;
        double x = n;
        while(Math.abs(x*x-n) > err) {
            x=(x+n/x)/2;
        }
        return x;
    }
}
