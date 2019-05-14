package com.spread.ydy.java8.chap6;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import com.spread.ydy.java8.chap4.Dish;

public class DividedByGroup {

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
        Map<Dish.Type, List<Dish>> dishesByType = 
                menu.stream().collect(groupingBy(Dish::getType));
        System.out.println(dishesByType);
        System.out.println("------------------------------------------------------------");

        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = menu.stream().collect(groupingBy(dish -> {
            if(dish.getCalories() <= 400) return CaloricLevel.DIET;
            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
            else return CaloricLevel.FAT;
        }));
        System.out.println(dishesByCaloricLevel);
        System.out.println("------------------------------------------------------------");

        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel = menu.stream().collect(groupingBy(Dish::getType,
                groupingBy(dish -> {
            if(dish.getCalories() <= 400) return CaloricLevel.DIET;
            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
            else return CaloricLevel.FAT;
        })));
        System.out.println(dishesByTypeCaloricLevel);
        System.out.println("------------------------------------------------------------");

        Map<Dish.Type, Long> typesCount = 
                menu.stream().collect(groupingBy(Dish::getType, counting()));
        System.out.println(typesCount);
        System.out.println("------------------------------------------------------------");

        Map<Dish.Type, Optional<Dish>> mostCaloricByType = 
                menu.stream().collect(groupingBy(Dish::getType, maxBy(comparingInt(Dish::getCalories))));
        System.out.println(mostCaloricByType);
        System.out.println("------------------------------------------------------------");

        Map<Dish.Type, Dish> mostCaloricByTypeDish = 
                menu.stream().collect(groupingBy(Dish::getType, collectingAndThen(maxBy(comparingInt(Dish::getCalories)), Optional::get)));
        System.out.println(mostCaloricByTypeDish);
        System.out.println("------------------------------------------------------------");

        Map<Dish.Type, Integer> totalCaloricByType = 
                menu.stream().collect(groupingBy(Dish::getType, summingInt(Dish::getCalories)));
        System.out.println(totalCaloricByType);
        System.out.println("------------------------------------------------------------");

        Map<Dish.Type, Set<CaloricLevel>> caloricLevelByType = menu.stream().collect(groupingBy(Dish::getType,
                mapping(dish -> {
            if(dish.getCalories() <= 400) return CaloricLevel.DIET;
            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
            else return CaloricLevel.FAT;
        }, toSet())));
        System.out.println(caloricLevelByType);
        System.out.println("------------------------------------------------------------");

        caloricLevelByType = menu.stream().collect(groupingBy(Dish::getType,
                mapping(dish -> {
            if(dish.getCalories() <= 400) return CaloricLevel.DIET;
            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
            else return CaloricLevel.FAT;
        }, toCollection(HashSet::new))));
        System.out.println(caloricLevelByType);
    }

    public enum CaloricLevel {DIET, NORMAL, FAT}
}
/*
 * 6.3 divide by group
{FISH=[prawns, salmon], OTHER=[french fries, rice, season fruit, pizza], MEAT=[pork, beef, chicken]}
{DIET=[chicken, rice, season fruit, prawns], FAT=[pork], NORMAL=[beef, french fries, pizza, salmon]}
{FISH={DIET=[prawns], NORMAL=[salmon]}, OTHER={DIET=[rice, season fruit], NORMAL=[french fries, pizza]}, MEAT={DIET=[chicken], FAT=[pork], NORMAL=[beef]}}
{FISH=2, OTHER=4, MEAT=3}
{FISH=Optional[salmon], OTHER=Optional[pizza], MEAT=Optional[pork]}
{FISH=salmon, OTHER=pizza, MEAT=pork}
{FISH=750, OTHER=1550, MEAT=1900}
{FISH=[DIET, NORMAL], OTHER=[DIET, NORMAL], MEAT=[DIET, FAT, NORMAL]}
{FISH=[DIET, NORMAL], OTHER=[DIET, NORMAL], MEAT=[DIET, FAT, NORMAL]}
*/
