package task5;

public class Cucumber extends Food {
    public Cucumber() {
        super("Огурец");
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.VEGETABLE;
    }

}
