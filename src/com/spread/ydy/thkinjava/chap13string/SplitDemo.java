package com.spread.ydy.thkinjava.chap13string;

import static com.spread.ydy.thkinjava.utils.Print.print;

import java.util.Arrays;
//: strings/SplitDemo.java
import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        print(Arrays.toString(Pattern.compile("!!").split(input)));
        // Only do the first three:
        print(Arrays.toString(Pattern.compile("!!").split(input, 3)));
    }
} /* Output:
[This, unusual use, of exclamation, points]
[This, unusual use, of exclamation!!points]
*///:~
