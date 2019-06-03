package com.spread.ydy.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestJava8 {

    public static void main(String[] args) {

        TestJava8 tj8 = new TestJava8();

        List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));

        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
        List<Apple> greenApples = filterColorApples(inventory, "green");
        System.out.println(greenApples);

        // [Apple{color='red', weight=120}]
        List<Apple> redApples = filterColorApples(inventory, "red");
        System.out.println(redApples);

        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
        List<Apple> greenApples2 = filterApples(inventory, tj8.new AppleGreenColorPredicate());
        System.out.println(greenApples2);

        // [Apple{color='green', weight=155}]
        List<Apple> heavyApples = filterApples(inventory, tj8.new AppleHeavyWeightPredicate());
        System.out.println(heavyApples);

        // []
        List<Apple> redAndHeavyApples = filterApples(inventory, tj8.new AppleRedAndHeavyPredicate());
        System.out.println(redAndHeavyApples);

        // [Apple{color='red', weight=120}]
        List<Apple> redApples2 = filterApples(inventory, new ApplePredicate() {
            public boolean test(Apple a) {
                return a.getColor().equals("red");
            }
        });
        System.out.println(redApples2);

        // []
        List<Apple> redApples2Lambda = filterApples(inventory, (Apple apple) -> "red".equals(apple.getColor()));
        System.out.println(redApples2Lambda);

    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterColorApples(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (color.equals(apple.getColor())) {
                System.out.println(inventory);
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            // if ("green".equals(apple.getColor())) {
            // if (color.equals(apple.getColor())) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public interface ApplePredicate {
        boolean test(Apple apple);
    }

    public class AppleHeavyWeightPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() > 150;
        }
    }

    public class AppleGreenColorPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return apple.getColor().equals("green");
        }
    }

    public class AppleRedAndHeavyPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return apple.getColor().equals("red") && apple.getWeight() > 150;
        }
    }

    public static class Apple {
        private int    weight = 0;
        private String color  = "";

        public Apple(int weight, String color) {
            this.weight = weight;
            this.color = color;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            return "Apple{" + "color='" + color + '\'' + ", weight=" + weight + '}';
        }
    }
}
