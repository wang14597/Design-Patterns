import BuilderPattern.*;
import BuilderPattern.Interface.Item;
import BuilderPattern.Interface.Packing;
import BuilderPattern.ItemImplement.ClodDrink;
import BuilderPattern.PackingImplement.Bottle;
import BuilderPattern.PackingImplement.Wrapper;
import org.junit.Assert;
import org.junit.Test;

public class BuilderPatternTest {

    @Test
    public void should_create_Wrapper_Packing_object() {
        Packing wrapper = new Wrapper();
        Assert.assertEquals("Wrapper", wrapper.pack());
    }

    @Test
    public void should_create_Bottle_Packing_object() {
        Packing wrapper = new Bottle();
        Assert.assertEquals("Bottle", wrapper.pack());
    }

    @Test
    public void should_create_VegBurger_Item_object() {
        Item burger = new VegBurger();
        Assert.assertSame(burger.getClass(), VegBurger.class);
    }

    @Test
    public void should_create_NoVegBurger_Item_object() {
        Item burger = new NoVegBurger();
        Assert.assertSame(burger.getClass(), NoVegBurger.class);
    }

    @Test
    public void should_create_coke_Item_object() {
        ClodDrink coke = new Coke();
        Assert.assertSame(coke.getClass(), Coke.class);
    }

    @Test
    public void should_create_pepsi_Item_object() {
        ClodDrink pepsi = new Pepsi();
        Assert.assertSame(pepsi.getClass(), Pepsi.class);
    }

    @Test
    public void should_create_first_Mela() {
        Meal meal = new Meal();
        Assert.assertEquals(meal.getCost(), 0.0, 0.00001);
    }

    @Test
    public void show_Mela() {
        Meal meal = new Meal();
        meal.addItems(new VegBurger());
        Assert.assertEquals("Meal{items=[name: Veg Burger, price: 25.0]}", meal.toString());
    }

    @Test
    public void should_create_VegBurgerMeal(){
        MealBuilder mealBuilder = MealBuilder.mealBuilder;
        Meal vegBurgerMeal= mealBuilder.CreateVegBurgerMeal();
        Assert.assertEquals(vegBurgerMeal.getCost(), 35.0f, 0.00001);
    }

    @Test
    public void should_create_NoVegBurgerMeal(){
        MealBuilder mealBuilder = MealBuilder.mealBuilder;
        Meal vegBurgerMeal= mealBuilder.CreateNoVegBurgerMeal();
        Assert.assertEquals(vegBurgerMeal.getCost(), 60.0f, 0.00001);
    }
}
