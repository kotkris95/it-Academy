package task5;


import java.util.Arrays;

public class Category {
    private String nameOfCategory;
    private Product[] products;

    public Category(String nameOfCategory, Product[] products) {
        this.nameOfCategory = nameOfCategory;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Категория:  " + nameOfCategory + " \nТовары: " + Arrays.toString(products) + "\n";
    }
}
