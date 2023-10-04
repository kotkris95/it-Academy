package task5;

public class Shop {
    public void printCategories(Category[] categories) {
        System.out.println("Каталог товаров: ");
        for (Category category : categories) {
            System.out.println(category.toString());
        }
    }
}
