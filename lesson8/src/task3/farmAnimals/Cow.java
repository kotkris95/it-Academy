package task3.farmAnimals;


public class Cow extends FarmAnimal {
    int amountOfMilkPerDay;
    int amountOfCottageCheesePerDay;
    int amountOfSourCreamPerDay;
    int amountOfCheesePerDay;


    public Cow() {
        super("КОРОВА", 20, new Product[]{
                Product.MEAT, Product.COTTAGE_CHEESE, Product.SOUR_CREAM, Product.CHEESE
        });
        amountOfMilkPerDay = 6 * numberOfAnimals;
        amountOfCottageCheesePerDay = 1 * numberOfAnimals;
        amountOfSourCreamPerDay = 1 * numberOfAnimals;
        amountOfCheesePerDay = 2 * numberOfAnimals;
    }

    public void printNumberOfProducts(int days) {
        System.out.println("Количество продуктов животного " + kindOfAnimal + " за " + days + " дней: ");
        System.out.println("МОЛОКО: " + amountOfMilkPerDay * days + " л.");
        System.out.println("ТВОРОГ: " + amountOfCottageCheesePerDay * days + " кг.");
        System.out.println("СМЕТАНА: " + amountOfSourCreamPerDay * days + " л.");
        System.out.println("СЫР: " + amountOfCheesePerDay * days + " кг.");
    }
}
