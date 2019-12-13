//: typeinfo/pets/ForNameCreator.java
package com.spread.ydy.thkinjava.chap14Rtt;
import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
        "com.spread.ydy.thkinjava.chap14Rtt.Mutt",
        "com.spread.ydy.thkinjava.chap14Rtt.Pug",
        "com.spread.ydy.thkinjava.chap14Rtt.EgyptianMau",
        "com.spread.ydy.thkinjava.chap14Rtt.Manx",
        "com.spread.ydy.thkinjava.chap14Rtt.Cymric",
        "com.spread.ydy.thkinjava.chap14Rtt.Rat",
        "com.spread.ydy.thkinjava.chap14Rtt.Mouse",
        "com.spread.ydy.thkinjava.chap14Rtt.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add((Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
    public static void main(String[] args) {
        System.out.println(types);
    }
} ///:~
