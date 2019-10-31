//: interfaces/music5/Music5.java
// Interfaces.
package com.spread.ydy.thkinjava.chap09interface;

import static com.spread.ydy.thkinjava.utils.Print.print;

import com.spread.ydy.thkinjava.chap08.utils.Note;

interface Instruments {
    // Compile-time constant:
    int VALUE = 5; // static & final
    // Cannot have method definitions:

    void play(Note n); // Automatically public

    void adjust();
}

class Winds implements Instruments {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public String toString() {
        return "Winds";
    }

    public void adjust() {
        print(this + ".adjust()");
    }
}

class Percussions implements Instruments {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public String toString() {
        return "Percussions";
    }

    public void adjust() {
        print(this + ".adjust()");
    }
}

class Stringeds implements Instruments {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public String toString() {
        return "Stringeds";
    }

    public void adjust() {
        print(this + ".adjust()");
    }
}

class Brasses extends Winds {
    public String toString() {
        return "Brasses";
    }
}

class Woodwinds extends Winds {
    public String toString() {
        return "Woodwinds";
    }
}

public class Music5 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    static void tune(Instruments i) {
        // ...
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instruments[] e) {
        for (Instruments i : e)
            tune(i);
    }

    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instruments[] orchestra = { new Winds(), new Percussions(), new Stringeds(), new Brasses(), new Woodwinds() };
        tuneAll(orchestra);
    }
} /*
   * Output: Winds.play() MIDDLE_C Percussions.play() MIDDLE_C Stringeds.play()
   * MIDDLE_C Brasses.play() MIDDLE_C Woodwinds.play() MIDDLE_C
   */// :~
