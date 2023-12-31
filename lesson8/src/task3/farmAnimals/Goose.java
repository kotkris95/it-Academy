package task3.farmAnimals;

public class Goose extends FarmAnimal {
    int amountOfMeatPerDay;

    public Goose() {
        super("ГУСЬ", 40, new Product[]{
                Product.MEAT
        });
        amountOfMeatPerDay = 2 * numberOfAnimals;
    }


    public void printNumberOfProducts(int days) {
        System.out.println("Количество продуктов животного " + kindOfAnimal + " за " + days + " дней: ");
        System.out.println("МЯСО: " + amountOfMeatPerDay * days + " кг.");
    }
}
