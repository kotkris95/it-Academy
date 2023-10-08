package task2.airline;

import task2.airTransport.AirTransport;
import task2.airTransport.quadcopter.Quadcopter1;

import java.util.Random;

public class QuadcopterArray extends Airline {

    public QuadcopterArray() {
        super(createAirTransport(10));
    }

    private static AirTransport[] createAirTransport(int length) {
        AirTransport[] airTransports = new AirTransport[length];
        Random random = new Random();
        for (int i = 0; i < airTransports.length; i++) {
            airTransports[i] = new Quadcopter1();
        }
        return airTransports;
    }
}
