package org.example.ord2022_23;

import java.util.Set;

public class Canary extends Bird{

    private boolean singing;

    public Canary(String name, String owner, int age, Set<Color> colors, boolean fly, boolean singing) {
        super(name, owner, age, colors, fly);
        this.singing=singing;
    }


    public void greets(){
        System.out.println("Hello, how are you?");
    }
    @Override
    public void speak() {
        System.out.println("PIO PIO");
    }
    @Override
    public void fly() {
        this.setFly(true);
    }

    @Override
    public void repose() {
        this.setFly(false);
    }

    public boolean isSinging() {
        return singing;
    }

    public void setSinging(boolean singing) {
        this.singing = singing;
    }
}
