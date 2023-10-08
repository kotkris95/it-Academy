package task2.airline;

import task2.airTransport.AirTransport;

import java.util.Arrays;
import java.util.Comparator;


public class Airline {
    private final AirTransport[] airTransports;

    public Airline(AirTransport[] airTransports) {
        this.airTransports = airTransports;
    }

    public int calculateTotalCapacity() {
        int totalCapacity = 0;
        for (AirTransport airTransport : airTransports) {
            totalCapacity += airTransport.getCapacity();
        }
        return totalCapacity;
    }

    public int calculateTotalLoadCapacity() {
        int totalLoadCapacity = 0;
        for (AirTransport airTransport : airTransports) {
            totalLoadCapacity += airTransport.getLoadCapacity();
        }
        return totalLoadCapacity;
    }

    public void sortByRangeOfFlight() {
        Arrays.sort(airTransports, Comparator.comparing(AirTransport::getRangeOfFlight));
    }

    public AirTransport[] findAirTransportsWithCertainLoadCapacity(int minLoadCapacity, int maxLoadCapacity) {
        AirTransport[] result = new AirTransport[airTransports.length];
        int index = 0;
        for (AirTransport airTransport : airTransports) {
            if (airTransport.getLoadCapacity() > minLoadCapacity && airTransport.getLoadCapacity() < maxLoadCapacity) {
                result[index++] = airTransport;
            }
        }
        return Arrays.copyOf(result, index);
    }

    @Override
    public String toString() {
        return "AirTransport{" +
                "airTansports=" + Arrays.toString(airTransports) +
                '}';
    }


}
