//: annotations/Testable.java
package com.spread.ydy.thkinjava.chap20annotation;

public class Testable {
    public void execute() {
        System.out.println("Executing..");
    }

    @Test
    void testExecute() {
        execute();
    }
} /// :~
