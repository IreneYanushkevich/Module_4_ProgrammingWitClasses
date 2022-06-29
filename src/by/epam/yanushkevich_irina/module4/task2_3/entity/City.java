package by.epam.yanushkevich_irina.module4.task2_3.entity;

public class City {

    private String cityName;
    private int population;

    public City(String cityName, int population) {
        this.cityName = cityName;
        this.population = population;
    }

    @Override
    public String toString() {
        return cityName + " city (population = " + population + " peoples)";
    }
}
