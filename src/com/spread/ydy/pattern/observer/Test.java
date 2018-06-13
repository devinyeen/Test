package com.spread.ydy.pattern.observer;

import com.spread.ydy.pattern.observer.classes.AObserver;
import com.spread.ydy.pattern.observer.classes.BObserver;

public class Test {

    public static void main(String[] args) {
        DbFields dbf = new DbFields();
        AObserver ao = new AObserver();
        BObserver bo = new BObserver();
        dbf.registerObserver(ao);
        dbf.registerObserver(bo);
        dbf.doSomething();
    }

}
