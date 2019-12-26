package com.spread.ydy.thkinjava.chap15Generic;

import java.util.List;
import java.util.Map;

import com.spread.ydy.thkinjava.utils.typeinfo.pets.Person;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.Pet;

public class ExplicitTypeSpecification {
    static void f(Map<Person, List<Pet>> petPeople) {}

    public static void main(String[] args) {
        f(New.<Person, List<Pet>>map());
    }
} ///:~
