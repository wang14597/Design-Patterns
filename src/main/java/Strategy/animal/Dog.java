package Strategy.animal;

public class Dog {
    public double food;

    public Dog(double food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
