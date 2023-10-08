package task2.airTransport.quadcopter;

import task2.airTransport.AirTransport;

public abstract class Quadcopter extends AirTransport {
    private String kindOfQuadcopter;

    public Quadcopter(String kindOfTransport, int capacity, int loadCapacity, int rangeOfFlight, String kindOfQuadcopter) {
        super(kindOfTransport, capacity, loadCapacity, rangeOfFlight);
        this.kindOfQuadcopter = kindOfQuadcopter;
    }

    public String getKindOfQuadcopter() {
        return kindOfQuadcopter;
    }
}
