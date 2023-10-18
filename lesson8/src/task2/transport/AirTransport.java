package task2.transport;

public class AirTransport {
    private String kindOfTransport;
    private int capacity;
    private int loadCapacity;
    private int rangeOfFlight;
    private String model;

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

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "AirTransport{" +
                "вид летного транспорта - '" + kindOfTransport + " " + this.getModel() + '\'' +
                ", вместимоть =" + capacity +
                ", грузоподъемность =" + loadCapacity +
                ", дальность полета =" + rangeOfFlight +
                '}';
    }
}
