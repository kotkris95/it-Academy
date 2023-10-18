package task4.figure;

import java.util.Random;

public class Circle extends Figure {
    int radius;

    public Circle() {
        super("Круг");
        Random random = new Random();
        radius = random.nextInt(10);
    }

    @Override
    public double calculatePerimeter() {
        return (long) (2 * 3.14 * radius);
    }

    @Override
    public double calculateArea() {
        return 3.14 * Math.pow(radius, 2);
    }

}
