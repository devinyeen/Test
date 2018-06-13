package com.spread.ydy.pattern.observer;

public interface Subject {
    public void doSomething();
    public void registerObserver(Observer o);
    public void unRegisterObserver(Observer o);
}
