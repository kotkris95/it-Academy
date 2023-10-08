package task4.figure;

import java.util.Random;

public class Triangle extends Figure {
    int a;
    int b;
    int c;

    public Triangle() {
        super("Треугольник");
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
        int p = (int) calculatePerimeter();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
