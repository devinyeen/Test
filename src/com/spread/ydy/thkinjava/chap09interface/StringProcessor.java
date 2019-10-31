//: interfaces/interfaceprocessor/StringProcessor.java
package com.spread.ydy.thkinjava.chap09interface;
import java.util.*;

public abstract class StringProcessor implements Processors {
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);

    public static String s = "If she weighs the same as a duck, she's made of wood";

    public static void main(String[] args) {
        Apply.process(new Upcases(), s);
        Apply.process(new Downcases(), s);
        Apply.process(new Splitters(), s);
    }
}

class Upcases extends StringProcessor {
    public String process(Object input) { // Covariant return
        return ((String) input).toUpperCase();
    }
}

class Downcases extends StringProcessor {
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitters extends StringProcessor {
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
} /* Output:
Using Processor Upcase
IF SHE WEIGHS THE SAME AS A DUCK, SHE'S MADE OF WOOD
Using Processor Downcase
if she weighs the same as a duck, she's made of wood
Using Processor Splitter
[If, she, weighs, the, same, as, a, duck,, she's, made, of, wood]
*///:~
