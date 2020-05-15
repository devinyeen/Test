package com.spread.ydy.thkinjava.chap18IO;

//: io/BasicFileOutput.java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {
    static String file = ".\\src\\com\\spread\\ydy\\thkinjava\\chap18IO\\BasicFileOutput.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read(".\\src\\com\\spread\\ydy\\thkinjava\\chap18IO\\BasicFileOutput.java")));
//        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        PrintWriter out = new PrintWriter(new FileWriter(file));
        int lineCount = 1;
        String s;
        long currentmills = System.currentTimeMillis();
        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ": " + s);
        out.close();
        long currentmills2 = System.currentTimeMillis();
        System.out.println((currentmills2 - currentmills));
        // Show the stored file:
        System.out.println(BufferedInputFile.read(file));
    }
} /* (Execute to see output) *///:~
