package task3.farmAnimals;

public abstract class FarmAnimals implements AmountOfProducts {
    String kindOfAnimal;
    int numberOfAnimals;
    Product[] products;

    public FarmAnimals(String kindOfAnimal, int numberOfAnimals, Product[] products) {
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
}
