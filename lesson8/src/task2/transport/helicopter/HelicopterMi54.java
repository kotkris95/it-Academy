package task2.transport.helicopter;

public class HelicopterMi54 extends Helicopter {
    public HelicopterMi54() {
        super("ВЕРТОЛЕТ", 4, 4500, 700);
    }

    @Override
    public String getModel() {
        return "МИ-54";
    }
}
