package task3.farmAnimals;

public class Goose extends FarmAnimals {
    int amountOfMeatPerDay;

    public Goose() {
        super("ГУСЬ", 40, new Product[]{
                new Product("Мясо")
        });
        amountOfMeatPerDay = 2 * numberOfAnimals;
    }

    @Override
    public void printNumberOfProducts(int days) {
        System.out.println("Количество продуктов животного " + kindOfAnimal + " за " + days + " дней: ");
        System.out.println("МЯСО: " + amountOfMeatPerDay * days + " кг.");
    }
}
