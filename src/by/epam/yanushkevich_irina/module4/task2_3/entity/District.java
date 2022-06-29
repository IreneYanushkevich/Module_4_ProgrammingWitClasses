package by.epam.yanushkevich_irina.module4.task2_3.entity;

import by.epam.yanushkevich_irina.module4.task2_3.entity.City;

import java.util.ArrayList;
import java.util.List;

public class District {

    private final String districtName;
    private int localityAmount;
    private final List<City> cities;

    public District(String districtName, int localityAmount) {
        this.districtName = districtName;
        this.localityAmount = localityAmount;
        cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    @Override
    public String toString() {
        return "district " + districtName + " includes " + localityAmount + " cities. For example: " + cities;
    }
}