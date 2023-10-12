package task3.farmAnimals;

public class Sheep extends FarmAnimal {
    int amountOfSkinPerDay;

    public Sheep() {
        super("ОВЦА", 15, new Product[]{
                Product.SKIN, Product.FAT
        });
        amountOfSkinPerDay = 1 * numberOfAnimals;
    }

    public void printNumberOfProducts(int days) {
        System.out.println("Количество продуктов животного " + kindOfAnimal + " за " + days + " дней: ");
        System.out.println("ШКУРА: " + amountOfSkinPerDay * days + " кг.");
    }
}
