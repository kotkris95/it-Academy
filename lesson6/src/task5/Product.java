package task5;

public class Product {
    private String nameOfProduct;
    private double price;
    private double rating;
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public Product(String nameOfProduct, double price) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public static final Product coat = new Product("Пальто", 300);
    public static final Product jacket = new Product("Жакет", 350);
    public static final Product blouse = new Product("Блузка", 150);
    public static final Product trousers = new Product("Брюки", 200);
    public static final Product curtains = new Product("Шторы", 550);
    public static final Product carpet = new Product("Ковер", 450);
    public static final Product pillow = new Product("Подушка", 70);
    public static final Product blanket = new Product("Одеяло", 150);
    public static final Product plate = new Product("Тарелка", 10);
    public static final Product cup = new Product("Чашка", 7);
    public static final Product spoons = new Product("Ложки", 20);
    public static final Product forks = new Product("Вилки", 20);


    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return nameOfProduct;
    }
}
