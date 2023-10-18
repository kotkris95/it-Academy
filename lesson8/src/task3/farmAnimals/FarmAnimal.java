package task3.farmAnimals;

public abstract class FarmAnimal {
    String kindOfAnimal;
    int numberOfAnimals;
    Product[] products;

    public FarmAnimal(String kindOfAnimal, int numberOfAnimals, Product[] products) {
        this.kindOfAnimal = kindOfAnimal;
        this.numberOfAnimals = numberOfAnimals;
        this.products = products;
    }

    public String getKindOfAnimal() {
        return kindOfAnimal;
    }

    public Product[] getProducts() {
        return products;
    }

    public abstract void printNumberOfProducts(int i);
}
