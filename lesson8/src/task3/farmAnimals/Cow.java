package task3.farmAnimals;


public class Cow extends FarmAnimals {
    int amountOfMilkPerDay;
    int amountOfCottageCheesePerDay;
    int amountOfSourCreamPerDay;
    int amountOfCheesePerDay;


    public Cow() {
        super("КОРОВА", 20, new Product[]{
                new Product("Молоко"), new Product("Творог"), new Product("Сметана"), new Product("Сыр")
        });
        amountOfMilkPerDay = 6 * numberOfAnimals;
        amountOfCottageCheesePerDay = 1 * numberOfAnimals;
        amountOfSourCreamPerDay = 1 * numberOfAnimals;
        amountOfCheesePerDay = 2 * numberOfAnimals;
    }


    @Override
    public void printNumberOfProducts(int days) {
        System.out.println("Количество продуктов животного " + kindOfAnimal + " за " + days + " дней: ");
        System.out.println("МОЛОКО: " + amountOfMilkPerDay*days + " л.");
        System.out.println("ТВОРОГ: " + amountOfCottageCheesePerDay*days + " кг.");
        System.out.println("СМЕТАНА: " + amountOfSourCreamPerDay*days + " л.");
        System.out.println("СЫР: " + amountOfCheesePerDay*days + " кг.");
    }
}
