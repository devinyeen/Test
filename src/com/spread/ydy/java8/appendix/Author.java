package com.spread.ydy.java8.appendix;

import java.lang.annotation.Repeatable;

@Repeatable(Authors.class)
@interface Author {
    String name();
}

@interface Authors{
    Author[] value();
}