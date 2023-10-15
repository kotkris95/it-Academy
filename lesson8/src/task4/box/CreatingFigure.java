package task4.box;

import task4.color.Blue;
import task4.color.Color;
import task4.color.Green;
import task4.color.Red;
import task4.figure.*;
import task4.material.Material;
import task4.material.Paper;
import task4.material.Plastic;
import task4.material.PlasticFilm;

import java.util.Random;

public class CreatingFigure {
    private Color color;
    private Figure figure;

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public Figure getFigure() {
        return figure;
    }

    public Material getMaterial() {
        return material;
    }

    private Material material;

    public CreatingFigure() {
        this.figure = creatingFigure();
        this.color = creatingColor();
        this.material = creatingMaterial();
    }

    public Figure creatingFigure() {
        Figure figure = new Circle();
        Random random = new Random();
        int randomCount = random.nextInt(4);
        switch (randomCount) {
            case (0) -> figure = new Rectangle();
            case (1) -> figure = new Square();
            case (2) -> figure = new Triangle();
        }
        return figure;
    }

    private Color creatingColor() {
        Color color = new Blue();
        Random random = new Random();
        int randomCount = random.nextInt(3);
        if (randomCount == 0) {
            color = new Red();
        } else if (randomCount == 1) {
            color = new Green();
        }
        return color;
    }

    private Material creatingMaterial() {
        Material material = new Paper();
        Random random = new Random();
        int randomCount = random.nextInt(3);
        if (randomCount == 0) {
            material = new Plastic();
        } else if (randomCount == 1) {
            material = new PlasticFilm();
        }
        return material;
    }

    @Override
    public String toString() {
        return "Фигура: " + getFigure() +
                " цвет: " + getColor() +
                ", материал: " + getMaterial();
    }
}
