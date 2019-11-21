package com.spread.ydy.thkinjava.chap13string;

public class InfiniteRecursion {
    public String toString() {
        return " InfiniteRecursion address: " + this + "\n";
    }

    public static void main(String[] args) {
        InfiniteRecursion ifr = new InfiniteRecursion();
        System.out.println(ifr);
    }
} ///:~
