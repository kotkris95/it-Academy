package task5;

public class Ham extends Food {
    public Ham() {
        super("Ветчина");
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.MEAT;
    }
}
