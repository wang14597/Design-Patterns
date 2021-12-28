package Strategy.comparator;

import Strategy.ComparatorImp;
import Strategy.animal.Dog;

public class DogComparator implements ComparatorImp<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {

        return Double.compare(o1.food, o2.food);
    }
}
