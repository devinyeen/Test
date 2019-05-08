package com.spread.ydy.java8.chap6;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.spread.ydy.java8.chap4.Dish;

public class DividedByPartition {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", false, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", false, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));


        Map<Boolean, List<Dish>> partitionedMenu =
                menu.stream().collect(partitioningBy(Dish::isVegetarian));
        System.out.println(partitionedMenu);
        List<Dish> veretarianDishes = partitionedMenu.get(true);
        System.out.println(veretarianDishes);
        System.out.println("------------------------------------------------------------");
        veretarianDishes =
                menu.stream().filter(Dish::isVegetarian).collect(toList());
        System.out.println(veretarianDishes);
        System.out.println("------------------------------------------------------------");
    }

}
