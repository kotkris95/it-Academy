public class Task4 {
    public static void main(String[] args) {
        int number = 12345;
        int originNumber = number;
        int lastDigit;
        int evenNumber = 0;
        int oddNumber = 0;

        do{
            lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                evenNumber++;
            } else{
                oddNumber++;
            }
            number/=10;
        } while(number > 0);

        System.out.println("Количество четных цифр числа " + originNumber + " равно " + evenNumber);
        System.out.println("Количество нечетных цифр числа " + originNumber + " равно " + oddNumber);

    }
}
