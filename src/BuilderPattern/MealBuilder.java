package BuilderPattern;
//创建一个类，实际的负责创建Meal对象
public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal prepareNonVegMeal(){
        Meal meal =new Meal();
        meal.addItem(new ChickenBerger());
        meal.addItem(new Pepsi());
        return  meal;
    }



}
