package task3;

import java.util.Random;

public class CheckingNumbers {
    public static void main(String[] args) throws GreaterException, LessException {
        check(getRandomInt(), getRandomInt());
    }

    public static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    public static void check(int myNumber, int randomNumber) throws LessException, GreaterException {
        int count = 1 + GreaterException.count + LessException.count;
        try {
            isSameNumbers(myNumber, randomNumber);
            System.out.println("Число " + myNumber + " угадано с " + count + " попытки!");
        } catch (LessException less) {
            check(myNumber, less.newNumber);
        } catch (GreaterException greater) {
            check(myNumber, greater.newNumber);
        }
    }

    public static void isSameNumbers(int myNumber, int randomNumber) throws LessException, GreaterException {
        if (randomNumber < myNumber) {
            throw new LessException(randomNumber);
        } else if (randomNumber > myNumber) {
            throw new GreaterException(randomNumber);
        }
    }
}
