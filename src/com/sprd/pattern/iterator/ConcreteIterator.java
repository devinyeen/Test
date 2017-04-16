package com.sprd.pattern.iterator;

import java.util.NoSuchElementException;

import com.sprd.pattern.iterator.aggregrate.ConcreteAggregate;


public class ConcreteIterator implements Iterator {

    private ConcreteAggregate agg;
    private int cursor;

    public ConcreteIterator(ConcreteAggregate agg) {
        this.agg = agg;
    }

    @Override
    public boolean hasNext() {
        return cursor < agg.size();
    }

    @Override
    public Object next() {
        if (cursor < agg.size())
            return agg.get(cursor++);
        else
            throw new NoSuchElementException();
    }

}
