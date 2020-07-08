//: net/mindview/atunit/Test.java
// The @Test tag.
package com.spread.ydy.thkinjava.chap20annotation.atunit;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {} /// :~
