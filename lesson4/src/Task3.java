public class Task3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        for (int i = 0; i < 20; i++){
            int sum = a+b;
            a = b;
            b = sum;
            System.out.print(a + " ");
        }
    }
}
