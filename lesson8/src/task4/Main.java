package task4;


import task4.box.Box;
import task4.box.CreatingFigure;


public class Main {
    public static void main(String[] args) {
        CreatingFigure[] figures = new Box().fillingBox();
        print(figures);
        System.out.println("Общий периметр всех фигур: " + getTotalPerimeter(figures));
        System.out.println("Общая площадь всех фигур: " + getTotalArea(figures));

    }

    public static void print(CreatingFigure[] figures){
        System.out.println("Количество фигур в коробке: " + figures.length);
        for (CreatingFigure figure: figures) {
            System.out.println(figure.toString() + " ");
        }
    }

    public static double getTotalPerimeter(CreatingFigure[] figures){
        double totalPerimeter = 0;
        for (CreatingFigure figure: figures) {
            totalPerimeter+= figure.figure.calculatePerimeter();
        }
        return totalPerimeter;
    }

    public static double getTotalArea(CreatingFigure[] figures){
        double totalArea = 0;
        for (CreatingFigure figure: figures) {
            totalArea+= figure.figure.calculateArea();
        }
        return totalArea;
    }
}
