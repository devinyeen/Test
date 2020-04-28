//: typeinfo/pets/LiteralPetCreator.java
// Using class literals.
package com.spread.ydy.thkinjava.chap14Rtt;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.spread.ydy.thkinjava.utils.typeinfo.pets.Cat;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.Cymric;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.Dog;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.EgyptianMau;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.Hamster;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.Manx;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.Mouse;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.Mutt;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.Pet;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.Pug;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.Rat;
import com.spread.ydy.thkinjava.utils.typeinfo.pets.Rodent;

public class LiteralPetCreator extends PetCreator {
    // No try block needed.
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes =
        Collections.unmodifiableList(Arrays.asList(
                Pet.class, Dog.class, Cat.class,  Rodent.class,
                Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                Cymric.class, Rat.class, Mouse.class,Hamster.class));
    // Types for random creation:
    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class),
                    allTypes.size());
    public List<Class<? extends Pet>> types() {
        return types;
    }
    public static void main(String[] args) {
        System.out.println(types);
    }
} /* Output:
[class typeinfo.pets.Mutt, class typeinfo.pets.Pug, class typeinfo.pets.EgyptianMau, class typeinfo.pets.Manx, class typeinfo.pets.Cymric, class typeinfo.pets.Rat, class typeinfo.pets.Mouse, class typeinfo.pets.Hamster]
*///:~
