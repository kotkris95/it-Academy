package task3.farmAnimals;

public class Duck extends FarmAnimal {
    int amountOfMeatPerDay;

    public Duck() {
        super("УТКА", 40, new Product[]{
                Product.MEAT
        });
        amountOfMeatPerDay = 2 * numberOfAnimals;
    }

    public void printNumberOfProducts(int days) {
        System.out.println("Количество продуктов животного " + kindOfAnimal + " за " + days + " дней: ");
        System.out.println("МЯСО: " + amountOfMeatPerDay * days + " кг.");

    }
}
