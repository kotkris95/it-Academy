package task3.farmAnimals;

public class Sheep extends FarmAnimals {
    int amountOfSkinPerDay;

    public Sheep() {
        super("ОВЦА", 15, new Product[]{
                new Product("Шкура"), new Product("Жир")
        });
        amountOfSkinPerDay = 1 * numberOfAnimals;
    }

    @Override
    public void printNumberOfProducts(int days) {
        System.out.println("Количество продуктов животного " + kindOfAnimal + " за " + days + " дней: ");
        System.out.println("ШКУРА: " + amountOfSkinPerDay * days + " кг.");
    }
}
