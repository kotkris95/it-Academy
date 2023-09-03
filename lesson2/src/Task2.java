public class Task2 {
    public static void main(String[] args) {
        /*
        если переменная z будет int, получится отрицательно число,
        т.к. максимальное значение int - 2 147 483 647
         */
        long z = 2147483647L + 1;
        System.out.println(z);
    }
}
