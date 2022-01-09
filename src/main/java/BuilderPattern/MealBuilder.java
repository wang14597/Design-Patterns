package BuilderPattern;

/*
 建造者模式：使用多个简单的对象一步一步构建成一个复杂的对象
*/
public enum MealBuilder {
    mealBuilder;

    public Meal CreateVegBurgerMeal() {
        Meal meal = new Meal();
        meal.addItems(new VegBurger());
        meal.addItems(new Coke());
        return meal;
    }

    public Meal CreateNoVegBurgerMeal() {
        Meal meal = new Meal();
        meal.addItems(new NoVegBurger());
        meal.addItems(new Coke());
        return meal;
    }
}
