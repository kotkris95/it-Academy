package task4.figure;

import java.util.Random;

public class Rectangle extends Figure {
    int a;
    int b;
    int c;

    public Rectangle() {
        super("Прямоугольник");
        Random random = new Random();
        a = random.nextInt(10);
        b = random.nextInt(10);
        c = random.nextInt(10);
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
