package com.spread.ydy.thkinjava.chap21thread;

//: concurrency/Atomicity.java
// {Exec: javap -c Atomicity}

public class Atomicity {

    public static void main(String[] args) {
        
    }

    int i;

    void f1() {
        i++;
    }

    void f2() {
        i += 3;
    }
} /* Output: (Sample)
...
void f1();
  Code:
   0:        aload_0
   1:        dup
   2:        getfield        #2; //Field i:I
   5:        iconst_1
   6:        iadd
   7:        putfield        #2; //Field i:I
   10:        return

void f2();
  Code:
   0:        aload_0
   1:        dup
   2:        getfield        #2; //Field i:I
   5:        iconst_3
   6:        iadd
   7:        putfield        #2; //Field i:I
   10:        return
*///:~
