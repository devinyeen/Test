//: typeinfo/pets/Pets.java
// Facade to produce a default PetCreator.
package com.spread.ydy.thkinjava.chap14Rtt;
import java.util.ArrayList;

import com.spread.ydy.thkinjava.utils.typeinfo.pets.Pet;

public class Pets {
    public static final PetCreator creator = new LiteralPetCreator();

    public static Pet randomPet() {
        return creator.randomPet();
    }

    public static Pet[] createArray(int size) {
        return creator.createArray(size);
    }

    public static ArrayList<Pet> arrayList(int size) {
        return creator.arrayList(size);
    }
} ///:~
