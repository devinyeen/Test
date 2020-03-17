//: generics/decorator/Decoration.java
package com.spread.ydy.thkinjava.chap15Generic;
import java.util.Date;

class BasicDecor {
    private String value;
    public void set(String val) { value = val; }
    public String get() { return value; }
}

class Decorator extends BasicDecor {
    protected BasicDecor basic;
    public Decorator(BasicDecor basic) { this.basic = basic; }
    public void set(String val) { basic.set(val); }
    public String get() { return basic.get(); }
}

class TimeStampedDecor extends Decorator {
    private final long timeStamp;
    public TimeStampedDecor(BasicDecor basic) {
        super(basic);
        timeStamp = new Date().getTime();
    }
    public long getStamp() { return timeStamp; }
}

class SerialNumberedDecor extends Decorator {
    private static long counter = 1;
    private final long serialNumber = counter++;
    public SerialNumberedDecor(BasicDecor basic) { super(basic); }
    public long getSerialNumber() { return serialNumber; }
}

public class Decoration {
    public static void main(String[] args) {
        TimeStampedDecor t = new TimeStampedDecor(new BasicDecor());
        TimeStampedDecor t2 = new TimeStampedDecor(new SerialNumberedDecor(new BasicDecor()));
        //! t2.getSerialNumber(); // Not available
        SerialNumberedDecor s = new SerialNumberedDecor(new BasicDecor());
        SerialNumberedDecor s2 = new SerialNumberedDecor(new TimeStampedDecor(new BasicDecor()));
        //! s2.getStamp(); // Not available
    }
} ///:~
