package BuilderPattern.ItemImplement;

import BuilderPattern.PackingImplement.Bottle;
import BuilderPattern.Interface.Item;
import BuilderPattern.Interface.Packing;

public abstract class ClodDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

    @Override
    public String toString() {
        return "name: " + name() +
                ", price: " + price();
    }
}
