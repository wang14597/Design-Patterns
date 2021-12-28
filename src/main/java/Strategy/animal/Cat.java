package Strategy.animal;

public class Cat {
    public double weight;
    public double high;

    public Cat(double weight, double high) {
        this.weight = weight;
        this.high = high;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", high=" + high +
                '}';
    }
}
