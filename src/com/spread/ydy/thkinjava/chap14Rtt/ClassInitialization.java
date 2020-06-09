package com.spread.ydy.thkinjava.chap14Rtt;

//: typeinfo/ClassInitialization.java
import java.util.Random;

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("unused")
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        // Does not trigger initialization:
        System.out.println(Initable.staticFinal);
        // Does trigger initialization:
        System.out.println(Initable.staticFinal2);
        System.out.println("------------------------------------------");
        // Does trigger initialization:
        System.out.println(Initable2.staticNonFinal);
        System.out.println("------------------------------------------");
        System.out.println(Initable3.staticNonFinal);
        @SuppressWarnings("unused")
        Class initable3 = Class.forName("com.spread.ydy.thkinjava.chap13string.Initable3");
        System.out.println("After creating Initable3 ref");
    }
} /* Output:
After creating Initable ref
47
Initializing Initable
258
Initializing Initable2
147
Initializing Initable3
After creating Initable3 ref
74
*///:~
