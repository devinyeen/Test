package com.spread.ydy.thkinjava.chap12exceptions;

//: exceptions/FullConstructors.java

class MyException extends Exception {
    public MyException() {
    }

    public MyException(String msg) {
        super(msg);
    }
}

public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
} /*
    Throwing MyException from f()
    com.spread.ydy.thkinjava.chap12exceptions.MyException
        at com.spread.ydy.thkinjava.chap12exceptions.FullConstructors.f(FullConstructors.java:17)
        at com.spread.ydy.thkinjava.chap12exceptions.FullConstructors.main(FullConstructors.java:27)
    Throwing MyException from g()
    com.spread.ydy.thkinjava.chap12exceptions.MyException: Originated in g()
        at com.spread.ydy.thkinjava.chap12exceptions.FullConstructors.g(FullConstructors.java:22)
        at com.spread.ydy.thkinjava.chap12exceptions.FullConstructors.main(FullConstructors.java:32)
   */// :~
