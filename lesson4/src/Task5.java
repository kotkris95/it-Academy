public class Task5 {
    public static void main(String[] args) {
        int number = 1234;
        int originNumber = number;
        int lastDigit;
        int sum = 0;
        int multiplication = 1;

        do{
            lastDigit = number % 10;
            sum+=lastDigit;
            multiplication*=lastDigit;
            number/=10;
        }while(number > 0);
        System.out.println("Сумма цифр числа " + originNumber + " равна "  + sum);
        System.out.println("Произведение цифр числа " + originNumber + " равно "  + multiplication);

    }
}
