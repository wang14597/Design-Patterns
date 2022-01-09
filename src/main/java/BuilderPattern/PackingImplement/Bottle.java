package BuilderPattern.PackingImplement;

import BuilderPattern.Interface.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
