package org.example.ord2022_23;

import java.util.Set;

public abstract class Bird extends Pet{

    private boolean fly;

    public Bird(String name, String owner, int age, Set<Color> colors, boolean fly){
        super(name, owner, age, colors);
        this.fly=fly;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }


    public abstract void fly();
    public abstract void repose();

}
