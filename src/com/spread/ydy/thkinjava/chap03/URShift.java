package com.spread.ydy.thkinjava.chap03;

public class URShift {
    public static void main(String[] args) {
        int i = -1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));

        long l = -1;
        System.out.println(Long.toBinaryString(l));

        l >>>= 10;
        System.out.println(Long.toBinaryString(l));

        short s = -1;
        System.out.println(Integer.toBinaryString(s));

        // 无符号右移运算需要将 s 强转为int，然后无符号右移10位，在右移完成后，就是这个样子1111111111111111111111（22个1）然后由于i是一个short类型，
        // 所以1111111111111111111111（22个1）需要强转为：1111111111111111（16位short类型），还是-1，在进行转为二进制字符串输出时，就是又是
        // 11111111111111111111111111111111（32个1）。
        s >>>= 10;
        System.out.println(Integer.toBinaryString(s));

        byte b = -1;
        System.out.println(Integer.toBinaryString(b));

        b >>>= 10;
        System.out.println(Integer.toBinaryString(b));

        b = -1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b >>> 10));
    }

}
