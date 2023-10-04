package task1;

public class Triangle {
    int a;
    int b;
    int c;
    static final int EQUILATERAL_TYPE = 1;
    static final int ISOSCELES_TYPE = 2;
    static final int RIGHT_TYPE = 3;


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
            return EQUILATERAL_TYPE; //равносторонний треугольник
        } else if ((a == b && !(a == c)) || (c == b && !(a == c)) || (a == c && !(a == b))) {
            return ISOSCELES_TYPE; //равнобедренный треугольник
        } else if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2)) ||
                Math.pow(b, 2) == (Math.pow(a, 2) + Math.pow(c, 2)) ||
                Math.pow(c, 2) == (Math.pow(b, 2) + Math.pow(a, 2))
        ) return RIGHT_TYPE; //прямоугольный треугольник
        else return 0;
    }

}
