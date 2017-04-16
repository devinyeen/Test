package com.sprd.pattern.iterator.aggregrate;

import com.sprd.pattern.iterator.Iterator;

public abstract class Aggregate {
    public abstract void add(Object o);

    public abstract void remove(Object o);

    public abstract Iterator iterator();
}
