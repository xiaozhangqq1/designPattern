package cn.zxl.builderpattern;

/**
 * Created by zhangxuelong on 2017/12/7
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:"+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("NoVegMeal");
        nonVegMeal.showItems();
        System.out.println("Total Cost:"+nonVegMeal.getCost());
    }
}
