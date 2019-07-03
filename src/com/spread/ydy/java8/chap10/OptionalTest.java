package com.spread.ydy.java8.chap10;

import java.util.Optional;

public class OptionalTest {

    //private static Car car;

    public static void main(String[] args) {
        //Optional<Car> optCar = Optional.of(car);// NEP if car is not initialized
        //Optional<Car> optCar = Optional.ofNullable(car);

        Represent represent = new Represent();
        represent.setName("Rep");

        Insurance insurance = new Insurance();
        insurance.setRepresent(Optional.of(represent));

        Car car = new Car();
        car.setInsurance(Optional.of(insurance));

        Optional<Person> person = Optional.of(new Person());
        person.get().setCar(Optional.of(car));

        System.out.println(person
                .flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .flatMap(Insurance::getRepresent)
                .map(Represent::getName)
                .orElse("Unknown"));

        Optional<Person> person1 = Optional.ofNullable(null);
        System.out.println(person1
                .flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .flatMap(Insurance::getRepresent)
                .map(Represent::getName)
                .orElse("Unknown"));

        person1 = Optional.ofNullable(new Person());
        System.out.println(person1
                .flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .flatMap(Insurance::getRepresent)
                .map(Represent::getName)
                .orElse("Unknown"));

        Optional.of(represent)
                .filter(rep -> "Rep".equals(represent.getName()))
                .ifPresent(x -> System.out.println("ok"));
    }

}

class Person {
    private Optional<Car> car = Optional.empty();//flatMap filed should be initialized with Optional.empty()

    public Optional<Car> getCar() {
        return car;
    }

    public void setCar(Optional<Car> car) {
        this.car = car;
    }
}

class Car {
    private Optional<Insurance> insurance;

    public Optional<Insurance> getInsurance() {
        return insurance;
    }

    public void setInsurance(Optional<Insurance> insurance) {
        this.insurance = insurance;
    }
}

class Insurance {
    private Optional<Represent> represent;

    public Optional<Represent> getRepresent() {
        return represent;
    }

    public void setRepresent(Optional<Represent> represent) {
        this.represent = represent;
    }
}

class Represent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}