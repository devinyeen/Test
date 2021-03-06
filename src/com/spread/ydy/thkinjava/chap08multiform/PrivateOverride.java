//: polymorphism/PrivateOverride.java
// Trying to override a private method.
package com.spread.ydy.thkinjava.chap08multiform;

import static com.spread.ydy.thkinjava.utils.Print.print;

public class PrivateOverride {
    private void f() {
        print("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
    public void f() {
        print("public f()");
    }
} /* Output:
private f()
*///:~
