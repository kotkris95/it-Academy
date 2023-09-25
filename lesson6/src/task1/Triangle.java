package task1;

public class Triangle {
    int a;
    int b;
    int c;

    Triangle(int a, int b, int c){
        this.a = a;
        this.b= b;
        this.c = c;
    }

    public int getPerimeter(){
        return a+b+c;
    }

    public double getArea(){
        int p = getPerimeter() / 2;
        return  Math.sqrt((p * (p - a)*(p - b) * (p - c)));
    }



    public int getTypeOfTriangle(){
        if(a == b && c == b){
            return 1; //равносторонний треугольник
        } else if((a == b && !(a==c)) || (c == b && !(a==c)) || (a == c && !(a==b))){
            return 2; //равнобедренный треугольник
        } else if(Math.pow(a,2)==(Math.pow(b,2)+Math.pow(c,2)) ||
                        Math.pow(b,2)==(Math.pow(a,2)+Math.pow(c,2))||
                            Math.pow(c,2)==(Math.pow(b,2)+Math.pow(a,2))
        )return 3; //прямоугольный треугольник
        else return 0;
    }
    public static int getMaxPerimeter(Triangle[] triangle){
        int maxPerimeter = triangle[0].getPerimeter();
        for (int i = 1; i < triangle.length; i++) {
            if(triangle[i].getPerimeter() > maxPerimeter){
                maxPerimeter = triangle[i].getPerimeter();
            }
        }
        return maxPerimeter;
    }

    public static int getMinPerimeter(Triangle[] triangle){
        int minPerimeter = triangle[0].getPerimeter();
        for (int i = 1; i < triangle.length; i++) {
            if(triangle[i].getPerimeter() < minPerimeter){
                minPerimeter = triangle[i].getPerimeter();
            }
        }
        return minPerimeter;
    }

    public static double getMaxArea(Triangle[] triangle){
        double maxArea = triangle[0].getArea();
        for (int i = 1; i < triangle.length; i++) {
            if(triangle[i].getArea() > maxArea){
                maxArea = triangle[i].getArea();
            }
        }
        return maxArea;
    }

    public static double getMinArea(Triangle[] triangle){
        double minArea = triangle[0].getArea();
        for (int i = 1; i < triangle.length; i++) {
            if(triangle[i].getArea() < minArea){
                minArea = triangle[i].getArea();
            }
        }
        return minArea;
    }

}
