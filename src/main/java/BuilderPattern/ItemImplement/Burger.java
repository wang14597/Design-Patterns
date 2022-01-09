package BuilderPattern.ItemImplement;

import BuilderPattern.Interface.Item;
import BuilderPattern.Interface.Packing;
import BuilderPattern.PackingImplement.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

    @Override
    public String toString() {
        return "name: " + name() +
                ", price: " + price();
    }
}
