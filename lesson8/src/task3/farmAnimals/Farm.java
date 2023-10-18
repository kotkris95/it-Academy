package task3.farmAnimals;

public class Farm {
    FarmAnimal[] farmAnimals;

    public Farm() {
        this.farmAnimals = new FarmAnimal[]{
                new Cow(), new Sheep(), new Chicken(), new Duck(), new Goose()};
    }

    public void printProductsAllAnimals() {
        for (FarmAnimal animal : farmAnimals) {
            System.out.println("Вид животного: " + animal.getKindOfAnimal());
            printProducts(animal.getProducts());
        }
    }

    public void printProducts(Product[] products) {
        System.out.print("Наименование продуктов: ");
        for (Product product : products) {
            System.out.print(product.getName() + " ");
        }
        System.out.println();
    }


    public void printNumberOfProducts() {
        for (FarmAnimal animals : farmAnimals) {
            animals.printNumberOfProducts(7);
            animals.printNumberOfProducts(30);
            animals.printNumberOfProducts(365);
        }
    }
}
