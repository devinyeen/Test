package com.spread.ydy.java8.appendix;

import java.util.Arrays;

public class ApiUpdates {

    public static void main(String[] args) {
        int[] evenNum = new int[10];
        Arrays.setAll(evenNum, i -> i * 2);
        for (int j = 0; j < evenNum.length; j++) {
            System.out.println(evenNum[j]);
        }
        System.out.println("-------------");

        evenNum = new int[10];
        Arrays.fill(evenNum, 1);
        for (int j = 0; j < evenNum.length; j++) {
            System.out.println(evenNum[j]);
        }
        System.out.println("-------------");

        Arrays.parallelPrefix(evenNum, (a, b) -> a + b);
        for (int j = 0; j < evenNum.length; j++) {
            System.out.println(evenNum[j]);
        }
    }

}
