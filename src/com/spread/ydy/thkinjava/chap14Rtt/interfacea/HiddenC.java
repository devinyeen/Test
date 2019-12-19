//: typeinfo/packageaccess/HiddenC.java
package com.spread.ydy.thkinjava.chap14Rtt.interfacea;
import static com.spread.ydy.thkinjava.utils.Print.print;

import com.spread.ydy.thkinjava.chap14Rtt.interfacea.A;

class C implements A {
    public void f() { print("public C.f()"); }
    public void g() { print("public C.g()"); }
    void u() { print("package C.u()"); }
    protected void v() { print("protected C.v()"); }
    private void w() { print("private C.w()"); }
}

public class HiddenC {
    public static A makeA() { return new C(); }
} ///:~
