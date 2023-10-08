package task2;

import task2.airTransport.AirTransport;
import task2.airTransport.helicopter.Helicopter;
import task2.airline.AirplanesArray;
import task2.airline.HelicopterArray;
import task2.airline.QuadcopterArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AirplanesArray airplanesArray = new AirplanesArray();
        System.out.println("САМОЛЕТ. Общая вместимость: " + airplanesArray.calculateTotalCapacity());
        System.out.println("САМОЛЕТ. Общая грузоподъемность: " + airplanesArray.calculateTotalLoadCapacity());

        HelicopterArray helicopterArray = new HelicopterArray();
        System.out.println("ВЕРТОЛЕТ. Общая вместимость: " + helicopterArray.calculateTotalCapacity());
        System.out.println("ВЕРТОЛЕТ. Общая грузоподъемность: " + helicopterArray.calculateTotalLoadCapacity());

        QuadcopterArray quadcopterArray = new QuadcopterArray();
        System.out.println("КВАДРОКОПТЕР. Общая вместимость: " + quadcopterArray.calculateTotalCapacity());
        System.out.println("КВАДРОКОПТЕР. Общая грузоподъемность: " + quadcopterArray.calculateTotalLoadCapacity());

        AirTransport[] airTransports = airplanesArray.findAirTransportsWithCertainLoadCapacity(200_000, 300_000);
        System.out.println(Arrays.toString(airTransports));

        airplanesArray.sortByRangeOfFlight();
        System.out.println(airplanesArray);


    }
}
