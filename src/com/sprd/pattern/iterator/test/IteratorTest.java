package com.sprd.pattern.iterator.test;

import com.sprd.pattern.iterator.Iterator;
import com.sprd.pattern.iterator.aggregrate.ConcreteAggregate;

public class IteratorTest {

    public static void main(String[] args) {
        ConcreteAggregate agg = new ConcreteAggregate();
        agg.add("Apple");
        agg.add("Book");
        agg.add("Cup");

        Iterator itr = agg.iterator();
        while (itr.hasNext()) {
            Object o = itr.next();
            if (o.toString().startsWith("C")) {
                System.out.println(o);
            }
        }
    }

}
