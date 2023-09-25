package task1;

import static task1.Triangle.*;

public class Main {
    public static void main(String[] args) {
        int equilateralTriangle = 0;
        int isoscelesTriangle = 0;
        int rightTriangle = 0;
        int anotherTriangle = 0;

        Triangle[] arrayOfTriangle = new Triangle[10];
        arrayOfTriangle[0] = new Triangle(13, 20, 11);
        arrayOfTriangle[1] = new Triangle(15, 15, 10);
        arrayOfTriangle[2] = new Triangle(8, 8, 8);
        arrayOfTriangle[3] = new Triangle(11, 11, 11);
        arrayOfTriangle[4] = new Triangle(6, 8, 14);
        arrayOfTriangle[5] = new Triangle(10, 10, 14);
        arrayOfTriangle[6] = new Triangle(14, 14, 8);
        arrayOfTriangle[7] = new Triangle(8, 10, 14);
        arrayOfTriangle[8] = new Triangle(6, 8, 10);
        arrayOfTriangle[9] = new Triangle(3, 4, 5);

        for (int i = 0; i < arrayOfTriangle.length; i++) {
            if(arrayOfTriangle[i].getTypeOfTriangle() == 1){
                equilateralTriangle++;
            } else if(arrayOfTriangle[i].getTypeOfTriangle() == 2){
                isoscelesTriangle++;
            }else if(arrayOfTriangle[i].getTypeOfTriangle() == 3){
                rightTriangle++;
            } else anotherTriangle++;
        }

        Triangle[] equilateral = new Triangle[equilateralTriangle];
        Triangle[] isosceles = new Triangle[isoscelesTriangle];
        Triangle[] right = new Triangle[rightTriangle];
        Triangle[] another = new Triangle[anotherTriangle];
        int e = 0;
        int is = 0;
        int r = 0;
        int a = 0;

        for (int i = 0; i < arrayOfTriangle.length; i++) {
            if(arrayOfTriangle[i].getTypeOfTriangle() == 1){
                equilateral[e] = arrayOfTriangle[i];
                e++;
            } else if(arrayOfTriangle[i].getTypeOfTriangle() == 2){
                isosceles[is] = arrayOfTriangle[i];
                is++;
            }else if(arrayOfTriangle[i].getTypeOfTriangle() == 3){
                right[r] = arrayOfTriangle[i];
                r++;
            } else{
                another[a] = arrayOfTriangle[i];
                a++;
            }
        }

        System.out.println("Количество равносторонних треугольников: " + equilateralTriangle +
                "\nКоличество равнобедренных треугольников: " + isoscelesTriangle +
                "\nКоличество прямоугольных треугольников: " + rightTriangle +
                "\nКоличество разносторонних треугольников: " + anotherTriangle

        );
        System.out.println("\nМаксимальный периметр равностороннего треугольника = " + getMaxPerimeter(equilateral)+
                "\nМинимальный периметр равностороннего треугольника = " + getMinPerimeter(equilateral) +
                "\nМаксимальная площадь равностороннего треугольника = " + getMaxArea(equilateral)+
                "\nМинимальная площадь равностороннего треугольника = " + getMinArea(equilateral)
        );
        System.out.println("\nМаксимальный периметр равнобедренного треугольника = " + getMaxPerimeter(equilateral)+
                "\nМинимальный периметр равнобедренного треугольника = " + getMinPerimeter(isosceles) +
                "\nМаксимальная площадь равнобедренного треугольника = " + getMaxArea(isosceles)+
                "\nМинимальная площадь равнобедренного треугольника = " + getMinArea(isosceles)
        );
        System.out.println("\nМаксимальный периметр прямоугольного треугольника = " + getMaxPerimeter(right)+
                "\nМинимальный периметр прямоугольного треугольника = " + getMinPerimeter(right) +
                "\nМаксимальная площадь прямоугольного треугольника = " + getMaxArea(right)+
                "\nМинимальная площадь прямоугольного треугольника = " + getMinArea(right)
        );
        System.out.println("\nМаксимальный периметр разностороннего треугольника = " + getMaxPerimeter(another)+
                "\nМинимальный периметр разностороннего треугольника = " + getMinPerimeter(another) +
                "\nМаксимальная площадь разностороннего треугольника = " + getMaxArea(another)+
                "\nМинимальная площадь разностороннего треугольника = " + getMinArea(another)
        );
    }
}
