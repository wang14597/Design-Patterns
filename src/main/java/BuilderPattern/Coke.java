package BuilderPattern;

import BuilderPattern.ItemImplement.ClodDrink;

public class Coke extends ClodDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
