package by.epam.yanushkevich_irina.module4.task_10.logic;

import by.epam.yanushkevich_irina.module4.task_10.entity.Airline;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AirportLogic {

    public List<Airline> findFlightByDestination(List<Airline> airlines, String destination) {
        List<Airline> foundFlights = new ArrayList<>();
        for (Airline airline : airlines) {
            if (airline.getDestination().equalsIgnoreCase(destination)) {
                foundFlights.add(airline);
            }
        }
        return foundFlights;
    }

    public List<Airline> findFlightByDayOfWeek(List<Airline> airlines, String dayOfWeek) {
        List<Airline> foundFlights = new ArrayList<>();
        for (Airline airline : airlines) {
            String[] days = airline.getDays().split(", ");
            for (String day : days) {
                if (day.equalsIgnoreCase(dayOfWeek)) {
                    foundFlights.add(airline);
                }
            }
        }
        return foundFlights;
    }

    public List<Airline> findFlightByDayOfWeekAdTime(List<Airline> airlines, String dayOfWeek, LocalTime time) {
        List<Airline> foundFlights;
        foundFlights = findFlightByDayOfWeek(airlines, dayOfWeek);
        for (Airline airline : foundFlights) {
            if (airline.getTime().isBefore(time)) {
                foundFlights.remove(airline);
            }
        }
        return foundFlights;
    }
}
