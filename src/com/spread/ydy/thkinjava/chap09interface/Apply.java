//: interfaces/interfaceprocessor/Apply.java
package com.spread.ydy.thkinjava.chap09interface;

import static com.spread.ydy.thkinjava.utils.Print.print;

interface Processors {
    String name();

    Object process(Object input);
}

public class Apply {
    public static void process(Processors p, Object s) {
        print("Using Processor " + p.name());
        print(p.process(s));
    }
} /// :~
