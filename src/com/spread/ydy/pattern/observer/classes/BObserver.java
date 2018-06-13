package com.spread.ydy.pattern.observer.classes;

import com.spread.ydy.pattern.observer.Observer;

public class BObserver implements Observer{

    @Override
    public void onNotify() {
        System.out.println("B observer");
    }

}
