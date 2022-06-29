package by.epam.yanushkevich_irina.module4.task2_3.entity;

import by.epam.yanushkevich_irina.module4.task2_3.entity.City;
import by.epam.yanushkevich_irina.module4.task2_3.entity.District;

import java.util.ArrayList;
import java.util.List;

public class Region {

    private final String regionName;
    private final City regionalСenter;
    private final int square;
    private final List<District> districts;

    public Region(String regionName, City regionalСenter, int square) {
        this.regionName = regionName;
        this.regionalСenter = regionalСenter;
        this.square = square;
        districts = new ArrayList<>();
    }

    public void addDistrict(District district) {
        districts.add(district);
    }

    public int getSquare() {
        return square;
    }

    public String getRegionName() {
        return regionName;
    }

    public City getRegionalСenter() {
        return regionalСenter;
    }

    @Override
    public String toString() {
        return "\n" + regionName + ": regional center " + regionalСenter + ", square is " + square + " km2. Region has " + districts;
    }
}