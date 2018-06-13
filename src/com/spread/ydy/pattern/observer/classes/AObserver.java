package com.spread.ydy.pattern.observer.classes;

import com.spread.ydy.pattern.observer.Observer;

public class AObserver implements Observer{

    @Override
    public void onNotify() {
        System.out.println("A observer");
    }

}
