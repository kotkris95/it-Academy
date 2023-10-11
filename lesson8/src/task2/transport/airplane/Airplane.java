package task2.transport.airplane;

import task2.transport.AirTransport;

public abstract class Airplane extends AirTransport {
    public Airplane(String kindOfTransport, int capacity, int loadCapacity, int rangeOfFlight) {
        super(kindOfTransport, capacity, loadCapacity, rangeOfFlight);
    }
}
