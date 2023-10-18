package task2.airline;

import task2.transport.AirTransport;
import task2.transport.airplane.AirplaneIL62;
import task2.transport.airplane.AirplaneTu134;
import task2.transport.helicopter.HelicopterKa226;
import task2.transport.helicopter.HelicopterMi54;
import task2.transport.quadcopter.Quadcopter1;

import java.util.Arrays;
import java.util.Comparator;


public class Airline {
    private AirTransport[] airTransports;
    int count;

    public Airline(int size) {
        airTransports = new AirTransport[size];
        count = 0;
    }

    public AirTransport[] getAirTransports() {
        return Arrays.copyOf(airTransports, count);
    }

    public void addAirTransport(AirTransport airTransport) {
        if (count < airTransports.length) {
            airTransports[count] = airTransport;
            count++;
        }
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
