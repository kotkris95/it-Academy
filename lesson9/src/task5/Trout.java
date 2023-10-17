package task5;

public class Trout extends Food {
    public Trout() {
        super("Форель");
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.FISH;
    }
}
