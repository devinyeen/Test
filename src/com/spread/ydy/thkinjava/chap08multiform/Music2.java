//: polymorphism/music/Music2.java
// Overloading instead of upcasting.
package com.spread.ydy.thkinjava.chap08multiform;
import static com.spread.ydy.thkinjava.utils.Print.print;

import com.spread.ydy.thkinjava.chap08multiform.utils.Brass;
import com.spread.ydy.thkinjava.chap08multiform.utils.Note;
import com.spread.ydy.thkinjava.chap08multiform.utils.Instrument;

public class Music2 {
    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Brass i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute); // No upcasting
        tune(violin);
        tune(frenchHorn);
    }
} /* Output:
Wind.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
*///:~
