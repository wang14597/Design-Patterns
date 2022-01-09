package BuilderPattern;

import BuilderPattern.ItemImplement.ClodDrink;

public class Pepsi extends ClodDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
