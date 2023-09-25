package task5;


import java.util.Arrays;

public class ShoppingCart {
    private Product[] purchasedGoods;
    private int[] countOfProducts;
    private int count;

    public ShoppingCart(int size) {
        purchasedGoods = new Product[size];
        countOfProducts = new int[size];
        count = 0;
    }

    public boolean add(Product product) {
        if (count >= purchasedGoods.length) {
            System.out.println("Корзина заполнена!");
        } else if (!(isSameProduct(product))) {
            purchasedGoods[count] = product;
            countOfProducts[count] = 1;
            count++;
        } else {
            for (int i = 0; i <= count; i++) {
                if (purchasedGoods[i] != null && purchasedGoods[i].equals(product)) {
                    countOfProducts[i]++;
                }
            }
        }
        return true;
    }


    private boolean isSameProduct(Product product) {
        for (int i = 0; i < purchasedGoods.length; i++) {
            if (purchasedGoods[i] != null && purchasedGoods[i].equals(product)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < purchasedGoods.length; i++) {
            if (purchasedGoods[i] != null) {
                s += purchasedGoods[i] + " " + countOfProducts[i] + " шт. ";

            }
        }
        return s;
    }
}
