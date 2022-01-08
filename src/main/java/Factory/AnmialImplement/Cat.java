package Factory.AnmialImplement;

import Factory.Interface.Animal;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat like eating fish ");
    }
}
