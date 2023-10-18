package task4.figure;

import java.util.Random;

public class Square extends Figure {
    int a;

    public Square() {
        super("Квадрат");
        Random random = new Random();
        a = random.nextInt(10);
    }


    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }

    @Override
    public double calculateArea() {
        return Math.pow(a, 2);
    }
}
