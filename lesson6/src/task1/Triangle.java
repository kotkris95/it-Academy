package task1;

public class Triangle {
    int a;
    int b;
    int c;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        int p = getPerimeter() / 2;
        return Math.sqrt((p * (p - a) * (p - b) * (p - c)));
    }

    public int getTypeOfTriangle() {
        if (a == b && c == b) {
            return 1; //равносторонний треугольник
        } else if ((a == b && !(a == c)) || (c == b && !(a == c)) || (a == c && !(a == b))) {
            return 2; //равнобедренный треугольник
        } else if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2)) ||
                Math.pow(b, 2) == (Math.pow(a, 2) + Math.pow(c, 2)) ||
                Math.pow(c, 2) == (Math.pow(b, 2) + Math.pow(a, 2))
        ) return 3; //прямоугольный треугольник
        else return 0;
    }

}
