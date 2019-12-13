//: typeinfo/pets/Individual.java
package com.spread.ydy.thkinjava.chap14Rtt;

public class Individual implements Comparable<Individual> {
    private static long counter = 0;
    private final long id = counter++;
    private String name;
    public Individual(String name) { this.name = name; }

    // 'name' is optional:
    public Individual() {}

    public String toString() {
        return getClass().getSimpleName() + (name == null ? "" : " " + name);
    }

    public long id() {
        return id;
    }

    public boolean equals(Object o) {
        return o instanceof Individual && id == ((Individual) o).id;
    }

    public int hashCode() {
        int result = 17;
        if (name != null)
            result = 37 * result + name.hashCode();
        result = 37 * result + (int) id;
        return result;
    }

    public int compareTo(Individual arg) {
        // Compare by class name first:
        String first = getClass().getSimpleName();
        String argFirst = arg.getClass().getSimpleName();
        int firstCompare = first.compareTo(argFirst);
        if (firstCompare != 0)
            return firstCompare;
        if (name != null && arg.name != null) {
            int secondCompare = name.compareTo(arg.name);
            if (secondCompare != 0)
                return secondCompare;
        }
        return (arg.id < id ? -1 : (arg.id == id ? 0 : 1));
    }

    public static void main(String[] args) {
        Class<?> subClass = Person.class;
        System.out.println(subClass.getSuperclass());
        subClass = Individual.class;
        System.out.println(subClass.getSuperclass());
    }
} ///:~

class Person extends Individual {
    public Person(String name) { super(name); }
} ///:~

class Pet extends Individual {
    public Pet(String name) { super(name); }
    public Pet() { super(); }
}
class Cat extends Pet {
    public Cat(String name) { super(name); }
    public Cat() { super(); }
}
class EgyptianMau extends Cat {
    public EgyptianMau(String name) { super(name); }
    public EgyptianMau() { super(); }
} ///:~
class Manx extends Cat {
    public Manx(String name) { super(name); }
    public Manx() { super(); }
} ///:~
class Cymric extends Manx {
    public Cymric(String name) { super(name); }
    public Cymric() { super(); }
} ///:~
class Dog extends Pet {
    public Dog(String name) { super(name); }
    public Dog() { super(); }
} ///:~
class Mutt extends Dog {
    public Mutt(String name) { super(name); }
    public Mutt() { super(); }
} ///:~
class Pug extends Dog {
    public Pug(String name) { super(name); }
    public Pug() { super(); }
} ///:~
class Rodent extends Pet {
    public Rodent(String name) { super(name); }
    public Rodent() { super(); }
} ///:~
class Hamster extends Rodent {
    public Hamster(String name) { super(name); }
    public Hamster() { super(); }
} ///:~
class Mouse extends Rodent {
    public Mouse(String name) { super(name); }
    public Mouse() { super(); }
} ///:~
class Rat extends Rodent {
    public Rat(String name) { super(name); }
    public Rat() { super(); }
} ///:~