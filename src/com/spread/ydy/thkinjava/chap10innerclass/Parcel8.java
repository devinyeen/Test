package com.spread.ydy.thkinjava.chap10innerclass;

import com.spread.ydy.thkinjava.chap10innerclass.interfaces.Wrapping;

//: innerclasses/Parcel8.java
// Calling the base-class constructor.

public class Parcel8 {
    public Wrapping wrapping(int x) {
        int i = 0;
        // Base constructor call:
        return new Wrapping(x) { // Pass constructor argument.
            public int value() {
                System.out.println(i);
                return super.value() * 47;
            }
        }; // Semicolon required
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
        w.value();
    }
} ///:~
