package Factory.AnimalFactor;

import Factory.AnmialImplement.Cat;
import Factory.AnmialImplement.Chicken;
import Factory.AnmialImplement.Dog;
import Factory.AnmialImplement.NoAnimalType;
import Factory.Interface.Animal;

public enum AnimalFactorSingleCase {

    factor;

    public Animal getAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("CAT")) return new Cat();
        if (animalType.equalsIgnoreCase("DOG")) return new Dog();
        if (animalType.equalsIgnoreCase("CHICKEN")) return new Chicken();
        return new NoAnimalType();
    }
}
