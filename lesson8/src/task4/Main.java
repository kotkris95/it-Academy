package task4;


import task4.box.Box;
import task4.box.CreatingFigure;
import task4.figure.Rectangle;
import task4.figure.Square;
import task4.figure.Triangle;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        CreatingFigure[] creatingFigures = new CreatingFigure[random.nextInt(10)];
        for (int i = 0; i < creatingFigures.length; i++) {
            creatingFigures[i] = new CreatingFigure();
        }
        Box box = new Box();

        box.print(creatingFigures);
        System.out.println("________________________________________________");
        System.out.println("Общий периметр всех фигур: " + Box.getTotalPerimeter(creatingFigures));
        System.out.println("Общая площадь всех фигур: " + Box.getTotalArea(creatingFigures));
        System.out.println("________________________________________________");
        box.getSimilarFigures(creatingFigures);
        System.out.println("________________________________________________");
        CreatingFigure[] newFigures = box.changeFigure(new Triangle(), new Square(), creatingFigures);
        for (int i = 0; i < newFigures.length; i++) {
            System.out.println(newFigures[i]);
        }


    }
}
