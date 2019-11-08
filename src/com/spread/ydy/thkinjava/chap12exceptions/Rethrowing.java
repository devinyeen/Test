package com.spread.ydy.thkinjava.chap12exceptions;

//: exceptions/Rethrowing.java
// Demonstrating fillInStackTrace()

public class Rethrowing {
    public static void f() throws Exception {
        System.out.println("originating the exception in f()");
        throw new Exception("thrown from f()");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside g(),e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside h(),e.printStackTrace()");
//            e.printStackTrace(System.out);
            throw (Exception) e.fillInStackTrace();//使用fillInStackTrace就是异常的新发生地，原来的异常发生点会丢失
        }
    }

    public static void main(String[] args) {
//        try {
//            g();
//        } catch (Exception e) {
//            System.out.println("main: printStackTrace()");
//            e.printStackTrace(System.out);
//        }
        try {
            h();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace();
        }
    }
} /*
originating the exception in f()
Inside g(),e.printStackTrace()
java.lang.Exception: thrown from f()
    at com.spread.ydy.thkinjava.chap12exceptions.Rethrowing.f(Rethrowing.java:9)
    at com.spread.ydy.thkinjava.chap12exceptions.Rethrowing.g(Rethrowing.java:14)
    at com.spread.ydy.thkinjava.chap12exceptions.Rethrowing.main(Rethrowing.java:34)
main: printStackTrace()
java.lang.Exception: thrown from f()
    at com.spread.ydy.thkinjava.chap12exceptions.Rethrowing.f(Rethrowing.java:9)
    at com.spread.ydy.thkinjava.chap12exceptions.Rethrowing.g(Rethrowing.java:14)
    at com.spread.ydy.thkinjava.chap12exceptions.Rethrowing.main(Rethrowing.java:34)
originating the exception in f()
Inside h(),e.printStackTrace()
java.lang.Exception: thrown from f()
    at com.spread.ydy.thkinjava.chap12exceptions.Rethrowing.f(Rethrowing.java:9)
    at com.spread.ydy.thkinjava.chap12exceptions.Rethrowing.h(Rethrowing.java:24)
    at com.spread.ydy.thkinjava.chap12exceptions.Rethrowing.main(Rethrowing.java:40)
main: printStackTrace()
java.lang.Exception: thrown from f()
    at com.spread.ydy.thkinjava.chap12exceptions.Rethrowing.h(Rethrowing.java:28)
    at com.spread.ydy.thkinjava.chap12exceptions.Rethrowing.main(Rethrowing.java:40)

   */// :~
