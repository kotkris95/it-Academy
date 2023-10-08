package task5;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Kristina", "1234abcd");
        User user2 = new User("Valeriya", "123456");

        Category[] categories = new Category[]{
                new Category("Одежда", new Product[]{
                        new Product("Пальто", 300),
                        new Product("Жакет", 350),
                        new Product("Блузка", 150),
                        new Product("Брюки", 200)}),
                new Category("Товары для дома", new Product[]{
                        new Product("Шторы", 550),
                        new Product("Ковер", 450),
                        new Product("Подушка", 70),
                        new Product("Одеяло", 150)}),
                new Category("Посуда", new Product[]{
                        new Product("Тарелка", 10),
                        new Product("Чашка", 7),
                        new Product("Ложки", 20),
                        new Product("Вилки", 20)})
        };

        new Shop().printCategories(categories);
        user1.add("Блузка");
        user1.add("Чашка");
        user1.add("Блузка");
        System.out.println(user1.print());
        user2.add("Шторы");
        user2.add("Пальто");
        user2.add("Жакет");
        user2.add("Одеяло");
        user2.add("Вилки");
        user2.add("Ложки");
        System.out.println(user2.print());
    }
}
