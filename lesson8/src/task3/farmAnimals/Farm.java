package task3.farmAnimals;

public class Farm {
    FarmAnimals[] farmAnimals;

    public Farm() {
        this.farmAnimals = new FarmAnimals[]{
                new Cow(), new Sheep(), new Chicken(), new Duck(), new Goose()};
    }

    public void printProductsAllAnimals() {
        for (FarmAnimals animal : farmAnimals) {
            System.out.println("Вид животного: " + animal.getKindOfAnimal());
            printProducts(animal.getProducts());
        }
    }

    public void printProducts(Product[] products) {
        System.out.print("Наименование продуктов: ");
        for (int i = 0; i < products.length; i++) {
            System.out.print(products[i] + " ");
        }
        System.out.println();
    }


    public void printNumberOfProductsPerWeek() {
        for (FarmAnimals animals : farmAnimals) {
            animals.printNumberOfProductsPerWeek();
        }
    }

    public void printNumberOfProductsPerMonth() {
        for (FarmAnimals animals : farmAnimals) {
            animals.printNumberOfProductsPerMonth();
        }
    }

    public void printNumberOfProductsPerYear() {
        for (FarmAnimals animals : farmAnimals) {
            animals.printNumberOfProductsPerYear();
        }
    }
}
