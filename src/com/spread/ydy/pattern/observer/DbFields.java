package com.spread.ydy.pattern.observer;

import java.util.ArrayList;

public class DbFields implements Subject{

    private ArrayList<Observer> obs = new ArrayList<>();
    @Override
    public void doSomething() {
        System.out.println("DbFields dosomething");
        for (int i = 0; i < obs.size(); i++) {
            obs.get(i).onNotify();
        }
    }

    @Override
    public void registerObserver(Observer ob) {
        // TODO Auto-generated method stub
        obs.add(ob);
    }

    @Override
    public void unRegisterObserver(Observer ob) {
        // TODO Auto-generated method stub
        obs.remove(ob);
    }

}
