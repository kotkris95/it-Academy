package task2.airTransport.airplane;

import task2.airTransport.AirTransport;

public abstract class Airplane extends AirTransport {
    private String kindOfAirplane;

    public Airplane(String kindOfTransport, int capacity, int loadCapacity, int rangeOfFlight, String kindOfAirplane) {
        super(kindOfTransport, capacity, loadCapacity, rangeOfFlight);
        this.kindOfAirplane = kindOfAirplane;
    }

    public String getKindOfAirplane() {
        return kindOfAirplane;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "Вид самолета'" + kindOfAirplane + '\'' +
                ", вместимоть = " + getCapacity() +
                ", грузоподъемность = " + getLoadCapacity() +
                ", дальность полета = " + getRangeOfFlight() +
                '}';
    }
}
