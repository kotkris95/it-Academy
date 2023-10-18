package task4.box;


import task4.color.Color;
import task4.figure.Figure;
import task4.material.Material;

public class Box {
    public void print(CreatingFigure[] figures) {
        System.out.println("Количество фигур в коробке: " + figures.length);
        for (CreatingFigure figure : figures) {
            System.out.println(figure.toString());
        }
    }

    public static double getTotalPerimeter(CreatingFigure[] figures) {
        double totalPerimeter = 0;
        for (CreatingFigure figure : figures) {
            totalPerimeter += figure.getFigure().calculatePerimeter();
        }
        return totalPerimeter;
    }

    public static double getTotalArea(CreatingFigure[] figures) {
        double totalArea = 0;
        for (CreatingFigure figure : figures) {
            totalArea += figure.getFigure().calculateArea();
        }
        return totalArea;
    }

    public void getSimilarFigures(CreatingFigure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            if (figures[i] != null) {
                for (int j = i + 1; j < figures.length; j++) {
                    if (figures[j] != null
                            && figures[i].getFigure().equals(figures[j].getFigure())
                            && figures[i].getColor().equals(figures[j].getColor())
                            && figures[i].getMaterial().equals(figures[j].getMaterial())
                    ) {
                        System.out.println("Фигура 1: " + figures[i].getFigure() + " цвет: " + figures[i].getColor()
                                + " материал: " + figures[i].getMaterial());
                        System.out.println("Фигура 2: " + figures[j].getFigure() + " цвет: " + figures[j].getColor()
                                + " материал: " + figures[j].getMaterial());
                    }
                }
            }
        }
    }

    public CreatingFigure[] changeFigure(Figure figure, Figure newFigure, CreatingFigure[] figures) {

        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getFigure() == figure) {
                Color c = figures[i].getColor();
                Material m = figures[i].getMaterial();
                figures[i] = null;
                CreatingFigure creatingFigure = new CreatingFigure();
                creatingFigure.setFigure(newFigure);
                creatingFigure.setColor(c);
                creatingFigure.setMaterial(m);
                figures[i] = creatingFigure;
            }
        }
        return figures;
    }
}
