package com.spread.ydy.thkinjava.chap15Generic;

//: generics/UseList.java
// {CompileTimeError} (Won't compile)
import java.util.*;

public class UseList<W, T> {
    void f(List<T> v) {}
    void f(List<W> v) {}
} ///:~