package BuilderPattern;

import BuilderPattern.Interface.Item;

import java.util.ArrayList;

public class Meal {
    private final ArrayList<Item> items = new ArrayList<>();

    public void addItems(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost+=item.price();
        }
        return cost;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "items=" + items +
                '}';
    }
}
