package by.epam.yanushkevich_irina.module4.task2_3.entity;

import by.epam.yanushkevich_irina.module4.task2_3.entity.City;
import by.epam.yanushkevich_irina.module4.task2_3.entity.Region;

import java.util.ArrayList;
import java.util.List;

public class State {

    private final String countryName;
    private final City capital;
    private final List<Region> regions;

    public State(String countryName, City capital) {
        this.countryName = countryName;
        this.capital = capital;
        regions = new ArrayList<>();
    }

    public void addRegion(Region region) {
        regions.add(region);
    }

    public City getCapital() {
        return capital;
    }

    public String getCountryName() {
        return countryName;
    }

    public List<Region> getRegions() {
        return regions;
    }

    @Override
    public String toString() {
        return "\nThe country " + countryName + " with tne capital in " + capital + " has regions:" + regions;
    }
}
