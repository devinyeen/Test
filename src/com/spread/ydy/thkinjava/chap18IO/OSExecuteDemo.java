package com.spread.ydy.thkinjava.chap18IO;

public class OSExecuteDemo {
    public static void main(String[] args) {
        OSExecute.command("javap .\\bin\\com\\spread\\ydy\\thkinjava\\chap18IO\\OSExecuteDemo");
    }
} /* Output:
Compiled from "OSExecuteDemo.java"
public class OSExecuteDemo extends java.lang.Object{
    public OSExecuteDemo();
    public static void main(java.lang.String[]);
}
*///:~
