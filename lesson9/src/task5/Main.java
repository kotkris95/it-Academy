package task5;

public class Main {
    public static void main(String[] args) {
        Food[] foods = {new Ham(), new Apple()};
        VegetarianCheck vegetarianCheck = new VegetarianCheck(foods);
        boolean isVegetarianFoods = vegetarianCheck.isVegetarian();
        System.out.print("Заданный список продуктов: \"");
        for (Food food: foods) {
            System.out.print(food.getName() + " ");
        }
        System.out.print("\" является вегетерианским? - " + isVegetarianFoods);
    }
}
