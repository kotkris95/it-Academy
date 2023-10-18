package task2.transport.helicopter;

import task2.transport.AirTransport;

public abstract class Helicopter extends AirTransport {
    public Helicopter(String kindOfTransport, int capacity, int loadCapacity, int rangeOfFlight) {
        super(kindOfTransport, capacity, loadCapacity, rangeOfFlight);
    }
}
