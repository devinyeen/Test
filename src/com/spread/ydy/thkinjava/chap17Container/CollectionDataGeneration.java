package com.spread.ydy.thkinjava.chap17Container;

//: containers/CollectionDataGeneration.java
// Using the Generators defined in the Arrays chapter.
import java.util.ArrayList;
import java.util.HashSet;

import com.spread.ydy.thkinjava.utils.CollectionData;
import com.spread.ydy.thkinjava.utils.RandomGenerator;

public class CollectionDataGeneration {
    public static void main(String[] args) {
        System.out.println(new ArrayList<String>(CollectionData.list(new RandomGenerator.String(9), 10)));
        System.out.println(new HashSet<Integer>(new CollectionData<Integer>(new RandomGenerator.Integer(), 10)));
    }
} /* Output:
[YNzbrnyGc, FOWZnTcQr, GseGZMmJM, RoEsuEcUO, neOEdLsmw, HLGEahKcx, rEqUCBbkI, naMesbtWH, kjUrUkZPg, wsqPzDyCy]
[573, 4779, 871, 4367, 6090, 7882, 2017, 8037, 3455, 299]
*///:~
