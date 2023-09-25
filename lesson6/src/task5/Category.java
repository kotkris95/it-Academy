package task5;


import java.util.Arrays;

public class Category {
    private String nameOfCategory;
    private Product[] products;

    public Category(String nameOfCategory, Product[] products) {
        this.nameOfCategory = nameOfCategory;
        this.products = products;
    }

    public static Product[] prodClothes = new Product[]{Product.coat, Product.jacket, Product.blouse, Product.trousers};
    public static Product[] prodHomeStuff = new Product[]{Product.curtains, Product.carpet, Product.pillow, Product.blanket};
    public static Product[] prodDishes = new Product[]{Product.plate, Product.cup, Product.spoons, Product.forks};

    public static final Category clothes = new Category("Одежда", prodClothes);
    public static final Category homeStuff = new Category("Товары для дома", prodHomeStuff);
    public static final Category dishes = new Category("Посуда", prodDishes);

    public String getNameOfCategory() {
        return nameOfCategory;
    }

    public Product[] getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Категория:  " + nameOfCategory + " \nТовары: " + Arrays.toString(products) + "\n";
    }
}
