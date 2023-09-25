package task5;


public class User {
    private String login;
    private String password;
    public ShoppingCart shoppingCart;

    public User(String login, String password, ShoppingCart shoppingCart) {
        this.login = login;
        this.password = password;
        this.shoppingCart = shoppingCart;
    }

    public String getLogin() {
        return login;
    }

    public String print() {
        return "В корзине " + getLogin() + ": \n" + shoppingCart.toString() + "\n";
    }
}
