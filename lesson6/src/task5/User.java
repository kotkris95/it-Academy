package task5;


public class User {
    private String login;
    private String password;
    public ShoppingCart shoppingCart;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        shoppingCart = new ShoppingCart(5);
    }

    public boolean add(String nameOfProduct) {
        return shoppingCart.add(nameOfProduct);
    }

    public String getLogin() {
        return login;
    }

    public String print() {
        return "В корзине " + getLogin() + ": \n" + shoppingCart.print() + "\n";
    }
}
