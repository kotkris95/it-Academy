package task2.airline;

import task2.airTransport.AirTransport;
import task2.airTransport.airplane.AirplaneIL62;
import task2.airTransport.airplane.AirplaneTu134;
import task2.airTransport.helicopter.HelicopterKa226;
import task2.airTransport.helicopter.HelicopterMi54;

import java.util.Random;

public class HelicopterArray extends Airline {
    public HelicopterArray() {
        super(createAirTransport(10));
    }

    private static AirTransport[] createAirTransport(int length) {
        AirTransport[] airTransports = new AirTransport[length];
        Random random = new Random();
        for (int i = 0; i < airTransports.length; i++) {
            airTransports[i] = createRandomAirTransports(random);
        }
        return airTransports;
    }

    private static AirTransport createRandomAirTransports(Random random) {
        return random.nextBoolean() ? new HelicopterKa226() : new HelicopterMi54();
    }
}
