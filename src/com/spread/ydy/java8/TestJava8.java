package com.spread.ydy.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestJava8 {

    public static void main(String[] args) {
        
    }

    //public static List<Apple> filterGreenApples(List<Apple> inventory) {
    public static List<Apple> filterGreenApples(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : result) {
            //if ("green".equals(apple.getColor())) {
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static class Apple {
      private int weight = 0;
      private String color = "";

      public Apple(int weight, String color){
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
          return "Apple{" +
                 "color='" + color + '\'' +
                 ", weight=" + weight +
                 '}';
      }
  }
}
