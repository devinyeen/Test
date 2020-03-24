package com.spread.ydy.thkinjava.chap16Arrays;

//: arrays/MultidimensionalPrimitiveArray.java
// Creating multidimensional arrays.
import java.util.Arrays;

public class MultidimensionalPrimitiveArray {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, }, { 4, 5, 6, }, };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(a));
    }
} /* Output:
[[I@15db9742, [I@6d06d69c]
[[1, 2, 3], [4, 5, 6]]
*///:~
