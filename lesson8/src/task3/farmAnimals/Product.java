package task3.farmAnimals;

public class Product {
    private String name;
    public static final Product EGG = new Product("Яйцо");
    public static final Product MEAT = new Product("Мясо");
    public static final Product CHEESE = new Product("Сыр");
    public static final Product COTTAGE_CHEESE = new Product("Творог");
    public static final Product SOUR_CREAM = new Product("Сметана");
    public static final Product SKIN = new Product("Шкура");
    public static final Product FAT = new Product("Жир");

    private Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
