package com.spread.ydy.thkinjava.chap21thread;

//: concurrency/Joining.java
// Understanding join().
import static com.spread.ydy.thkinjava.utils.Print.print;

class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
    }

    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            print(getName() + " was interrupted. " + "isInterrupted(): " + isInterrupted());
            return;
        }
        print(getName() + " has awakened");
    }
}

class Joiner extends Thread {
    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            print("Interrupted");
        }
        print(getName() + " join completed");
    }
}

public class Joining {
    public static void main(String[] args) {
        Sleeper sleepy1 = new Sleeper("Sleepy1", 1500);
        Sleeper sleepy2 = new Sleeper("Sleepy2", 1500);
        Joiner joiner1 = new Joiner("Joiner1", sleepy1);
        Joiner joiner2 = new Joiner("Joiner2", sleepy2);
        sleepy2.interrupt();
    }
} /* Output:
Grumpy was interrupted. isInterrupted(): false
Doc join completed
Sleepy has awakened
Dopey join completed
*///:~
