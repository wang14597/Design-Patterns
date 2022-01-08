package Factory;

import Factory.AnimalFactor.AnimalFactorSingleCase;
import Factory.Interface.Animal;

/*
* 结合单例模式，生成单例工厂对象，实现工厂模式
*/
public class Main {
    public static void main(String[] args) throws Exception{
       String[] animals = {"cat", "dog", "chicken"};
        AnimalFactorSingleCase animalFactor = AnimalFactorSingleCase.factor;
        for (String animal : animals) {
            Animal animalObject = animalFactor.getAnimal(animal);
            animalObject.eat();
        }
    }
}
