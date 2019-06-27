package com.spread.ydy.java8.chap09;

public class C implements B, A {

    public static void main(String[] args) {
        new C().hello();
        new D().hello();
        new E().hello();
        new F().hello();
        new G().hello();
    }

}

interface A {
    default void hello() {
        System.out.println("Hello from A");
    }
}

interface B extends A {
    default void hello() {
        System.out.println("Hello from B");
    }
}

class D implements A {
}

class E extends D implements B, A {
}

class F implements A {
    public void hello() {
        System.out.println("Hello from F");
    }
}

class G implements B, A {
    public void hello() {
        B.super.hello();
    }
}