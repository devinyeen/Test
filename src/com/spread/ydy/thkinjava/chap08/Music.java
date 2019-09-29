//: polymorphism/music/Music.java
// Inheritance & upcasting.
package com.spread.ydy.thkinjava.chap08;

import static com.spread.ydy.thkinjava.utils.Print.print;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument {
    public void play(Note n) {
        print("Instrument.play()");
    }
}

class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
} /* Output:
Wind.play() MIDDLE_C
*///:~
