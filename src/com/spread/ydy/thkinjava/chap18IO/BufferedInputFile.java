package com.spread.ydy.thkinjava.chap18IO;

//: io/BufferedInputFile.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
    // Throw exceptions to console:
    public static String read(String filename) throws IOException {
        // Reading input by lines:
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        long currentMs = System.currentTimeMillis();
        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");
        }
        in.close();
        long currentMs2 = System.currentTimeMillis();
        long gap = currentMs2 - currentMs;
        System.out.println(gap);
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.print(read(".\\src\\com\\spread\\ydy\\thkinjava\\chap18IO\\BufferedInputFile.java"));
    }
} /* (Execute to see output) *///:~
