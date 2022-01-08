package Factory.AnmialImplement;

import Factory.Interface.Animal;

public class Chicken implements Animal {
    @Override
    public void eat() {
        System.out.println("Chicken usually were eaten by people");
    }
}
