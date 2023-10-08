package task4.box;

import java.util.Random;

public class Box {
    CreatingFigure[] creatingFigures;

    public Box() {
        Random random = new Random();
        creatingFigures = new CreatingFigure[random.nextInt(100)];
    }

    public CreatingFigure[] fillingBox() {
        CreatingFigure[] result = new CreatingFigure[creatingFigures.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new CreatingFigure();
        }
        return result;
    }
}
