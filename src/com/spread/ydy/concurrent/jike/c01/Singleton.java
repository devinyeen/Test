package com.spread.ydy.concurrent.jike.c01;

// Singleton with problem
public class Singleton {
    static Singleton instance;
    static Singleton getInstance() {
        if (null == instance) {// 两个线程，如果A线程在下面1处分配空间，但是没有初始化，这边判空条件不成立，进入到2，返回的值是空
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();//1
                }
            }
        }
        return instance;//2
    }
}
