public class Task3 {
    public static void main(String[] args) {
        int x = 1234;
        int lastTwoNumbers = x % 100;
        int firstTwoNumbers = (x - lastTwoNumbers) / 100;
        System.out.println(firstTwoNumbers);
        System.out.println(lastTwoNumbers);
    }
}
