package Strategy;
/*
* 对不同对对象排序，自定义不同对排序规则，也即不同对象拥有不同对策略。
* 不同的对象，各自实现 ComparatorImp 接口（实现各自的策略）
*/

import Strategy.animal.Cat;
import Strategy.animal.Dog;
import Strategy.comparator.CatComparator;
import Strategy.comparator.DogComparator;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Cat[] cats = {new Cat(5,5),new Cat(3,3),new Cat(1,1)};
        Dog[] dogs = {new Dog(2),new Dog(4), new Dog(1)};
        Sorter<Dog> dogSorter = new Sorter<>();
        Sorter<Cat> catSorter = new Sorter<>();
        dogSorter.sort(dogs, new DogComparator());
        catSorter.sort(cats, new CatComparator());
        System.out.println(Arrays.toString(cats));
        System.out.println(Arrays.toString(dogs));
    }
}
