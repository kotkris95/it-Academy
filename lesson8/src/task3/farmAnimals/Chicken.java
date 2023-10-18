package task3.farmAnimals;

public class Chicken extends FarmAnimal {
    int amountOfEggsPerDay;
    int amountOfMeatPerDay;

    public Chicken() {
        super("КУРИЦА", 50, new Product[]{
                Product.EGG, Product.MEAT
        });
        amountOfEggsPerDay = 5 * numberOfAnimals;
        amountOfMeatPerDay = 3 * numberOfAnimals;
    }

    public void printNumberOfProducts(int days) {
        System.out.println("Количество продуктов животного " + kindOfAnimal + " за " + days + " дней: ");
        System.out.println("ЯЙЦА: " + amountOfEggsPerDay * days + " шт.");
        System.out.println("МЯСО: " + amountOfMeatPerDay * days + " кг.");
    }
}
