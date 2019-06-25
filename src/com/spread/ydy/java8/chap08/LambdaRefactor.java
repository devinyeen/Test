package com.spread.ydy.java8.chap08;

public class LambdaRefactor {

    public static void main(String[] args) {
        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                System.out.println("Hello1");
            }
        };
        Thread mLoadThread = new Thread(r1, "R1");
        mLoadThread.start();

        Runnable r2 = () -> System.out.println("Hello2");
        mLoadThread = new Thread(r2, "R2");
        mLoadThread.start();

        int a = 10;
        r1 = () -> {
            //int a = 2;// compile error in lambda
        };

        r2 = new Runnable() {

            @Override
            public void run() {
                int a = 2;
            }
        };
    }

}
