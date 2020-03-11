package com.spread.ydy.thkinjava.chap15Generic;

//: generics/CuriouslyRecurringGeneric.java

class GenericType<T> {}

public class CuriouslyRecurringGeneric extends GenericType<CuriouslyRecurringGeneric> {} /// :~
