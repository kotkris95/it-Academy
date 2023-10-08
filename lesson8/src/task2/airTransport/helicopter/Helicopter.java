package task2.airTransport.helicopter;

import task2.airTransport.AirTransport;

public abstract class Helicopter extends AirTransport {
    private String kindOfHelicopter;

    public Helicopter(String kindOfTransport, int capacity, int loadCapacity, int rangeOfFlight, String kindOfHelicopter) {
        super(kindOfTransport, capacity, loadCapacity, rangeOfFlight);
        this.kindOfHelicopter = kindOfHelicopter;
    }

    public String getKindOfHelicopter() {
        return kindOfHelicopter;
    }
}
