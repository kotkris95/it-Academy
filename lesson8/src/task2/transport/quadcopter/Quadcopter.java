package task2.transport.quadcopter;

import task2.transport.AirTransport;

public abstract class Quadcopter extends AirTransport {

    public Quadcopter(String kindOfTransport, int capacity, int loadCapacity, int rangeOfFlight) {
        super(kindOfTransport, capacity, loadCapacity, rangeOfFlight);
    }
}
