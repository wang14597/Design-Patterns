package Strategy.comparator;

import Strategy.ComparatorImp;
import Strategy.animal.Cat;

public class CatComparator implements ComparatorImp<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {

        return Double.compare(o1.weight, o2.weight);
    }
}
