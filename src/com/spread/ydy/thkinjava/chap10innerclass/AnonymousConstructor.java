package com.spread.ydy.thkinjava.chap10innerclass;

//: innerclasses/AnonymousConstructor.java
// Creating a constructor for an anonymous inner class.
import static com.spread.ydy.thkinjava.utils.Print.print;


abstract class Base {
    public Base(int i) {
        print("Base constructor, i = " + i);
    }

    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            // 代替匿名内部类的构造器
            {
                print("Inside instance initializer");
            }

            public void f() {
                print("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
} /* Output:
Base constructor, i = 47
Inside instance initializer
In anonymous f()
*///:~
