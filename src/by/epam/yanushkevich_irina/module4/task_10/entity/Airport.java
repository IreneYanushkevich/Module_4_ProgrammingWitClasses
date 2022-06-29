package by.epam.yanushkevich_irina.module4.task_10.entity;


import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Airline> airlines;

    {
        airlines = new ArrayList<>();
    }

    public Airport() {
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    public void addAirline(Airline airline) {
        airlines.add(airline);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        if (airlines == null) {
            return airport.airlines == null;
        } else return airlines.equals(airport.airlines);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((airlines == null) ? 0 : airlines.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "\nAirport scoreboard:\n" + airlines;
    }
}
