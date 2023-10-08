package task3.farmAnimals;

public class Product {
    String nameOfProduct;

    public Product(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    @Override
    public String toString() {
        return nameOfProduct;
    }
}
