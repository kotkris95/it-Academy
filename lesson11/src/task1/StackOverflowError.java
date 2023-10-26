package task1;

public class StackOverflowError {
    public static void main(String[] args) {
        stackOverflowError(1);
    }

    public static void stackOverflowError(int num) {
        System.out.println("Number: " + num);

        if (num == 0)
            return;
        else
            stackOverflowError(++num);
    }
}
