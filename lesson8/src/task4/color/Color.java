package task4.color;

public abstract class Color {
    String color;

    public Color(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }

}
