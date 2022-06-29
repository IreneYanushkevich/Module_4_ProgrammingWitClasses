package by.epam.yanushkevich_irina.module4.task2_5.entity;

import by.epam.yanushkevich_irina.module4.task2_5.entity.Nutrition;
import by.epam.yanushkevich_irina.module4.task2_5.entity.Purpose;
import by.epam.yanushkevich_irina.module4.task2_5.entity.Transport;

public class Tour {

    private String country;
    private Purpose purpose;
    private int duration;
    private Transport transport;
    private Nutrition nutrition;
    private int price;

    public Tour(String country, Purpose purpose, int duration, Transport transport, Nutrition nutrition, int price) {
        this.country = country;
        this.purpose = purpose;
        this.duration = duration;
        this.transport = transport;
        this.nutrition = nutrition;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition food) {
        this.nutrition = food;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" + "country " + country + ", purpose " + purpose + ", duration " + duration +
                ", transport " + transport + ", food " + nutrition + ", price = " + price;
    }
}

