package com.spread.ydy.thkinjava.chap15Generic;

import java.util.List;
import java.util.Map;

import com.spread.ydy.thkinjava.utils.typeinfo.pets.Person;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.Pet;

public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {}

    public static void main(String[] args) {
         f(New.map());
    }
} ///:~
