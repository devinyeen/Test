package com.spread.ydy.java8.chap14;

import java.util.function.DoubleUnaryOperator;

public class Currying {

    public static void main(String[] args) {
        DoubleUnaryOperator converCtoF = curriedConverter(9.0/5, 32);
        System.out.println(converCtoF.applyAsDouble(1000));
    }

    static DoubleUnaryOperator curriedConverter(double f, double b) {
        return (double x) -> x * f + b;
    }
}
