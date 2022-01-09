package BuilderPattern.PackingImplement;

import BuilderPattern.Interface.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
