package task4.figure;

import task4.color.Color;
import task4.material.Material;

public abstract class Figure {
    String typeOfFigure;
    Color color;
    Material material;

    public Figure(String typeOfFigure) {
        this.typeOfFigure = typeOfFigure;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();


    @Override
    public String toString() {
        return typeOfFigure;
    }
}
