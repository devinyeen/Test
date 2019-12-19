package com.spread.ydy.thkinjava.chap11holdobjects;

import static com.spread.ydy.thkinjava.utils.Print.print;

import java.util.HashMap;
import java.util.Map;

import com.spread.ydy.thkinjava.utils.typeinfo.pets.Cat;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.Dog;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.Hamster;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.Pet;

public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<String, Pet>();
        petMap.put("My Cat", new Cat("Molly"));
        petMap.put("My Dog", new Dog("Ginger"));
        petMap.put("My Hamster", new Hamster("Bosco"));
        print(petMap);
        Pet dog = petMap.get("My Dog");
        print(dog);
        print(petMap.containsKey("My Dog"));
        print(petMap.containsValue(dog));
    }
} /* Output:
{My Cat=Cat Molly, My Hamster=Hamster Bosco, My Dog=Dog Ginger}
Dog Ginger
true
true
*///:~