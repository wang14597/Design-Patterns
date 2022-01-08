package Factory.AnmialImplement;

import Factory.Interface.Animal;

public class NoAnimalType implements Animal {
    @Override
    public void eat() {
        System.out.println("No Animal Type");
    }
}
