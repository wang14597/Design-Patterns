package Factory.AnmialImplement;

import Factory.Interface.Animal;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog like eat meats");
    }
}
