package com.spread.ydy.thkinjava.chap13string;

//: strings/ReFlags.java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReFlags {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE | Pattern.COMMENTS);
        Matcher m = p.matcher("java has regex\nJava has regex\n"
                            + "JAVA has pretty good regular expressions\n"
                            + "Regular expressions are in Java\n"
                            + "#Java test");
        while (m.find())
            System.out.println(m.group());
    }
} /* Output:
java
Java
JAVA
*///:~
