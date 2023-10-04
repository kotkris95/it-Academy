package task5;


public class ShoppingCart {
    private String[] purchasedGoods;
    private int[] countOfProducts;
    private int count;

    public ShoppingCart(int size) {
        purchasedGoods = new String[size];
        countOfProducts = new int[size];
        count = 0;
    }

    public boolean add(String nameOfProduct) {
        if (count >= purchasedGoods.length) {
            System.out.println("Корзина заполнена! Товар " + nameOfProduct + " не добавлен.");
        } else if (!(isSameProduct(nameOfProduct))) {
            purchasedGoods[count] = nameOfProduct;
            countOfProducts[count] = 1;
            count++;
        } else {
            for (int i = 0; i <= count; i++) {
                if (purchasedGoods[i] != null && purchasedGoods[i].equals(nameOfProduct)) {
                    countOfProducts[i]++;
                }
            }
        }
        return true;
    }


    private boolean isSameProduct(String nameOfProduct) {
        for (int i = 0; i < purchasedGoods.length; i++) {
            if (purchasedGoods[i] != null && purchasedGoods[i].equals(nameOfProduct)) {
                return true;
            }
        }
        return false;
    }

    public String print() {
        String s = "";
        for (int i = 0; i < purchasedGoods.length; i++) {
            if (purchasedGoods[i] != null) {
                s += purchasedGoods[i] + " " + countOfProducts[i] + " шт. ";

            }
        }
        return s;
    }
}
