package org.example.ord2022_23;

import java.util.HashSet;
import java.util.Set;

public class PetRepository implements IPetRepository{
    MyModelTAD<Pet> pets = new MyModelTAD<>();
    @Override
    public void add(Pet pet) {
        pets.addHead(pet);
    }

    @Override
    public Pet get(int index) {
        return pets.get(index);
    }

    @Override
    public Pet remove(int index) {
        return pets.remove(index);
    }
    @Override
    public Set<Pet> getAll() {
        Set<Pet> allPets = new HashSet<>();
        Pet aux;

        int index= pets.getSize();
        while (index>0){
            aux= pets.get(index-1);
            allPets.add(aux);
            index--;
        }

        return allPets;

    }

}
