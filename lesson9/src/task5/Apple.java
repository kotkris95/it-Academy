package task5;

public class Apple extends Food {
    public Apple() {
        super("Яблоко");
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.FRUIT;
    }

}
