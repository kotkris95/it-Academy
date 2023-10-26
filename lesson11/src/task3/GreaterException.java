package task3;

import java.util.Random;

public class GreaterException extends Exception {
    public static int count = 0;
    public int newNumber;

    public GreaterException(int number) {
        count++;
        Random random = new Random();
        newNumber = random.nextInt(0, number);
    }
}
