package com.spread.ydy.java8.chap4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;


    public static void main(String[] args) {
//        List<Dish> menu = Arrays.asList(
//                new Dish("pork", false, 800, Dish.Type.MEAT),
//                new Dish("beef", false, 700, Dish.Type.MEAT),
//                new Dish("chicken", false, 400, Dish.Type.MEAT),
//                new Dish("french fries", false, 530, Dish.Type.OTHER),
//                new Dish("rice", true, 350, Dish.Type.OTHER),
//                new Dish("season fruit", false, 120, Dish.Type.OTHER),
//                new Dish("pizza", true, 550, Dish.Type.OTHER),
//                new Dish("prawns", false, 300, Dish.Type.FISH),
//                new Dish("salmon", false, 450, Dish.Type.FISH));
//        Map<Dish.Type, List<Dish>> dishesByType = 
//                menu.stream().collect(groupingBy(Dish::getType));
//        System.out.println(dishesByType);
    }

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        super();
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    @Override
    public String toString() {
//        return "Dish [name=" + name + "]";
        return name;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    private final Type type;

    public enum Type {
        MEAT, FISH, OTHER
    }
}
