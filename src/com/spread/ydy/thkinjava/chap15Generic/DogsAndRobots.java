package com.spread.ydy.thkinjava.chap15Generic;

import static com.spread.ydy.thkinjava.utils.Print.*;

import com.spread.ydy.thkinjava.utils.typeinfo.pets.Dog;

//: generics/DogsAndRobots.java
// No latent typing in Java
interface Performs {
    void speak();
    void sit();
}

class PerformingDog extends Dog implements Performs {
    public void speak() { print("Woof!"); }
    public void sit() { print("Sitting"); }
    public void reproduce() {}
}

class Robot implements Performs {
    public void speak() { print("Click!"); }
    public void sit() { print("Clank!"); }
    public void oilChange() {}
}

class Communicate {
    public static <T extends Performs> void perform(T performer) {
        performer.speak();
        performer.sit();
    }
}

public class DogsAndRobots {
    public static void main(String[] args) {
        PerformingDog d = new PerformingDog();
        Robot r = new Robot();
        Communicate.perform(d);
        Communicate.perform(r);
    }
} /* Output:
Woof!
Sitting
Click!
Clank!
*///:~
