//: annotations/database/Uniqueness.java
// Sample of nested annotations
package com.spread.ydy.thkinjava.chap20annotation;

public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
} /// :~
