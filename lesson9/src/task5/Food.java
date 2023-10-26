package task5;

public abstract class Food {
    private final String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract FoodType getFoodType();
}
