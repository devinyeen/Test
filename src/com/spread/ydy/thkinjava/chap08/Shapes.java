package com.spread.ydy.thkinjava.chap08;

//: typeinfo/Shapes.java
import java.util.Arrays;
import java.util.List;
import java.util.Random;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "Triangle";
    }
}

class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(3)) {
        default:
        case 0:
            return new Circle();
        case 1:
            return new Square();
        case 2:
            return new Triangle();
        }
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (Shape shape : shapeList)
            shape.draw();
    }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
