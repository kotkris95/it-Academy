package task3.farmAnimals;

public interface AmountOfProducts {
    void printNumberOfProducts(int days);

    default void printNumberOfProductsPerWeek() {
        printNumberOfProducts(7);
    }

    default void printNumberOfProductsPerMonth() {
        printNumberOfProducts(30);
    }

    default void printNumberOfProductsPerYear() {
        printNumberOfProducts(365);
    }
}
