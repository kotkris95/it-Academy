

public class Task2 {
    public static void main(String[] args) {
        String s = "раз два три";
        System.out.println(s);
        String[] array = s.split(" ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }
}
