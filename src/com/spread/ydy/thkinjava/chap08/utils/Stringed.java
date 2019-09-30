package com.spread.ydy.thkinjava.chap08.utils;
import com.spread.ydy.thkinjava.chap08.utils.Instrument;
import static com.spread.ydy.thkinjava.utils.Print.print;

public class Stringed extends Instrument {
    public void play(Note n) {
        print("Stringed.play() " + n);
    }
}