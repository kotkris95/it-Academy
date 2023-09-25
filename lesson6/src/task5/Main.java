package task5;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Kristina", "1234abcd", new ShoppingCart(5));
        User user2 = new User("Valeriya", "123456", new ShoppingCart(5));
        User user3 = new User("Marina", "12345666", new ShoppingCart(5));
        User user4 = new User("Elizaveta", "1111111jhcbfh", new ShoppingCart(5));

        System.out.println("Каталог товаров: \n");
        System.out.println(Category.clothes.toString());
        System.out.println(Category.homeStuff.toString());
        System.out.println(Category.dishes.toString());

        user1.shoppingCart.add(Product.blouse);
        user1.shoppingCart.add(Product.pillow);
        user1.shoppingCart.add(Product.pillow);

        user2.shoppingCart.add(Product.forks);
        user2.shoppingCart.add(Product.carpet);

        user3.shoppingCart.add(Product.coat);

        user4.shoppingCart.add(Product.jacket);
        user4.shoppingCart.add(Product.plate);
        user4.shoppingCart.add(Product.plate);
        user4.shoppingCart.add(Product.plate);

        System.out.println(user1.print());
        System.out.println(user2.print());
        System.out.println(user3.print());
        System.out.println(user4.print());
    }
}
