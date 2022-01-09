package BuilderPattern;

import BuilderPattern.ItemImplement.Burger;

public class NoVegBurger extends Burger {
    @Override
    public String name() {
        return "No Veg Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
