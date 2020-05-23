package BuilderPattern;
//使用演示创建者模式
public class BuilderPatternDemo {
    public static void main(String[] args) {

        MealBuilder mealBuilder=new MealBuilder();
        Meal vegMeal=mealBuilder.prepareVegMeal();

        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println(vegMeal.getCost());

        Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
        System.out.println("non-veg Meal");

        nonVegMeal.showItems();
        System.out.println(nonVegMeal.getCost());
    }


}
