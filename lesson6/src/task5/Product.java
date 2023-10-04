package task5;

public class Product {
    private String nameOfProduct;
    private double price;
    private double rating;

    public Product(String nameOfProduct, double price) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    @Override
    public String toString() {
        return nameOfProduct;
    }
}
