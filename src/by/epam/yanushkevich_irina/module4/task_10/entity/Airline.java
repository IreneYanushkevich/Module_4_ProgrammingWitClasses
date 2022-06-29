package by.epam.yanushkevich_irina.module4.task_10.entity;

import java.time.LocalTime;

public class Airline {

    private String destination;
    private int number;
    private String type;
    private LocalTime time;
    private String days;

    public Airline() {
    }

    public Airline(String destination, int number, String type, LocalTime time, String days) {
        this.destination = destination;
        this.number = number;
        this.type = type;
        this.time = time;
        this.days = days;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline air = (Airline) o;
        if (destination == null) {
            if (air.destination != null) {
                return false;
            }
        } else if (!destination.equals(air.destination)) {
            return false;
        }
        if (type == null) {
            if (air.type != null) {
                return false;
            }
        } else if (!type.equals(air.type)) {
            return false;
        }
        if (time == null) {
            if (air.time != null) {
                return false;
            }
        } else if (!time.equals(air.time)) {
            return false;
        }
        if (days == null) {
            if (air.days != null) {
                return false;
            }
        } else if (!days.equals(air.days)) {
            return false;
        }
        return number == air.number;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((destination == null) ? 0 : destination.hashCode());
        result = prime * result + number;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((time == null) ? 0 : time.hashCode());
        result = prime * result + ((days == null) ? 0 : days.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "\nAirline {destination: " + destination + ", N" + number + ", type: " + type + ", time: " + time + ", days: " + days + "}";
    }
}
