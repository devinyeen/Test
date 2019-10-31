package com.spread.ydy.thkinjava.chap09interface;

//: interfaces/RandomWords.java
// Implementing an interface to conform to a method.
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomWords implements Readable {
    private static Random rand = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private int count;

    public RandomWords(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {
        count--;
//        if (count-- == 0)
//            return -1; // Indicates end of input
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return count == 0 ? -1 : count; // Number of characters appended
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomWords(10));
        while (s.hasNext())// hasNext调用Readable的实现方法read
            System.out.println(s.next());
    }
} /* Output:
Yazeruyac
Fowenucor
Goeazimom
Raeuuacio
Nuoadesiw
Hageaikux
Ruqicibui
Numasetih
Kuuuuozog
Waqizeyoy
*///:~
