package task2;

import task2.airline.Airline;
import task2.transport.AirTransport;
import task2.transport.airplane.AirplaneIL62;
import task2.transport.airplane.AirplaneTu134;
import task2.transport.helicopter.HelicopterKa226;
import task2.transport.helicopter.HelicopterMi54;
import task2.transport.quadcopter.Quadcopter1;

public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline(5);
        airline.addAirTransport(new AirplaneIL62());
        airline.addAirTransport(new AirplaneTu134());
        airline.addAirTransport(new HelicopterKa226());
        airline.addAirTransport(new HelicopterMi54());
        airline.addAirTransport(new Quadcopter1());


        int totalCapacity = airline.calculateTotalCapacity();
        System.out.println("Общая вместимость " + totalCapacity + " пассажиров.");

        int totalLoadCapacity = airline.calculateTotalLoadCapacity();
        System.out.println("Общая грузоподъемность: " + totalLoadCapacity + " кг.");

        airline.sortByRangeOfFlight();
        System.out.println("Список летных средств после сортировки по дальности полета:");
        for (AirTransport transport: airline.getAirTransports()) {
            System.out.println(transport.getKindOfTransport() + " " + transport.getModel()
            + " Дальность полета: " + transport.getRangeOfFlight() + " км.");
        }

        int minRange = 200000;
        int maxRange = 300000;
        AirTransport[] airTransportsInRange = airline.findAirTransportsWithCertainLoadCapacity(minRange, maxRange);

        System.out.println("Летные средства в заданном диапазоне грузоподъёмности (" + minRange + " - "
                + maxRange + " кг):");
        for (AirTransport transport: airTransportsInRange) {
            System.out.println(transport.getKindOfTransport() + " " + transport.getModel()
                    + " Грузоподъёмность " + transport.getLoadCapacity() + " кг.");

        }
    }
}
