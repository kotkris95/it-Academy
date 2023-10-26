package task5;

public class VegetarianCheck {
    Food[] foods;

    public VegetarianCheck(Food[] foods) {
        this.foods = foods;
    }

    public boolean isVegetarian() {
        boolean b = true;
        for (Food food : foods) {
            if (food.getFoodType() == FoodType.MEAT
                    || food.getFoodType() == FoodType.FISH
            ) {
                b = false;
            }
        }
        return b;
    }
}
