package task2.airTransport;

public class AirTransport {
    private String kindOfTransport;
    private int capacity;
    private int loadCapacity;
    private int rangeOfFlight;

    public AirTransport(String kindOfTransport, int capacity, int loadCapacity, int rangeOfFlight) {
        this.kindOfTransport = kindOfTransport;
        this.capacity = capacity;
        this.loadCapacity = loadCapacity;
        this.rangeOfFlight = rangeOfFlight;
    }

    public String getKindOfTransport() {
        return kindOfTransport;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    @Override
    public String toString() {
        return "AirTransport{" +
                "вид летного транспорта - '" + kindOfTransport + '\'' +
                ", вместимоть =" + capacity +
                ", грузоподъемность =" + loadCapacity +
                ", дальность полета =" + rangeOfFlight +
                '}';
    }
}
