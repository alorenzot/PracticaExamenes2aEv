package org.example.ord2022_23;


import java.util.*;

public abstract class Pet {
    private String name;
    private String owner;
    private int age;
    private boolean alive;
    private Set<Color> colors;

    public Pet(String name, String owner, int age, Set<Color> colors){
        this.name=name;
        this.owner=owner;
        this.age=age;
        this.colors = new HashSet<>();
        this.colors.addAll(colors);
        alive=true;
    }

    public abstract void speak();

    public void anniversary(){
        age++;
    }

    public void die(){
        alive=false;
    }

    @Override
    public boolean equals(Object obj){
        if (obj==null) return false;
        if (!(obj instanceof Pet)) return false;
        Pet p = (Pet) obj;
        return name.equals(p.name) && owner.equals(p.owner) && age==p.age;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    public boolean isAlive() {
        return alive;
    }

    public Set<Color> getColors() {
        return colors;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                ", colors=" + colors +
                '}';
    }

}