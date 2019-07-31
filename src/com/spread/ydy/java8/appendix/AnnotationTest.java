package com.spread.ydy.java8.appendix;

import java.util.Arrays;
import java.util.List;

import com.sun.istack.internal.NotNull;

public class AnnotationTest {

    public static void main(String[] args) {
        Author[] authors = Book.class.getAnnotationsByType(Author.class);
        Arrays.asList(authors).forEach(a -> {System.out.println(a.name());});
        List<Author> list = Arrays.asList(authors);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name());
        }
        test(null);
    }

    public static void test(@NotNull String a) {
        System.out.println(a);
    }
}

@Author(name="Raoul") @Author(name="Mario") @Author(name="Alan")
class Book{}