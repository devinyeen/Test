//: polymorphism/music/Music.java
// Inheritance & upcasting.
package com.spread.ydy.thkinjava.chap08multiform;

import com.spread.ydy.thkinjava.chap08multiform.utils.Instrument;
import com.spread.ydy.thkinjava.chap08multiform.utils.Note;
import com.spread.ydy.thkinjava.chap08multiform.utils.Wind;;

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
} /*
   * Output: Wind.play() MIDDLE_C
   */// :~
