package task3;

import java.util.Random;

public class LessException extends Exception {
    static int count = 0;
    public int newNumber;

    public LessException(int number) {
        count++;
        Random random = new Random();
        newNumber = random.nextInt(number, 1000);

    }
}
