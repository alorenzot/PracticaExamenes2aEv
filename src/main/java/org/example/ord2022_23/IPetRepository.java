package org.example.ord2022_23;

import java.util.Set;

public interface IPetRepository {
    void add(Pet pet);

    Pet get(int index);

    Pet remove(int index);

    Set<Pet> getAll();
}
