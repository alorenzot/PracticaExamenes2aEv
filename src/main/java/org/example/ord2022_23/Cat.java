package org.example.ord2022_23;

import java.util.Set;

public class Cat extends Pet{
    private boolean longhair;

    public Cat(String name, String owner, int age, Set<Color> colors, boolean longhair) {
        super(name, owner, age, colors);
        this.longhair=longhair;
    }


    @Override
    public void speak() {
        System.out.println("MIAU MIAU");
    }

    public boolean hasLonghair() {
        return longhair;
    }
}
