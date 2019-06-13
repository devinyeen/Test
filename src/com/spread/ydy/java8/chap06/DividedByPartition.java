package com.spread.ydy.java8.chap06;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

import com.spread.ydy.java8.chap04.Dish;

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

        Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishesByType =
                menu.stream().collect(partitioningBy(Dish::isVegetarian,
                        groupingBy(Dish::getType)));
        System.out.println(vegetarianDishesByType);
        System.out.println("------------------------------------------------------------");


        Map<Boolean, Dish> mostCaloricPartitionedBy =
                menu.stream().collect(partitioningBy(Dish::isVegetarian,
                        collectingAndThen(maxBy(comparingInt(Dish::getCalories)),
                                Optional::get)));
        System.out.println(mostCaloricPartitionedBy);
        System.out.println("------------------------------------------------------------");
        IntSummaryStatistics menuStatics = menu.stream().collect(summarizingInt(Dish::getCalories));
        System.out.println(menuStatics);
    }
}
