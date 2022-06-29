package by.epam.yanushkevich_irina.module4.task_6;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
    }

    public Time(int hh, int mm, int ss) {
        hours = checkForValidityHour(hh);
        minutes = checkForValidityMinSec(mm);
        seconds = checkForValidityMinSec(ss);
    }

    public void setHours(int hh) {
        hours = checkForValidityHour(hh);
    }

    public int getHours() {
        return hours;
    }

    public void setMinutes(int mm) {
        minutes = checkForValidityMinSec(mm);
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int ss) {
        seconds = checkForValidityMinSec(ss);
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Time other = (Time) obj;
        return this.hours == other.hours && this.minutes == other.minutes && this.seconds == other.seconds;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + hours;
        result = prime * result + minutes;
        result = prime * result + seconds;
        return result;
    }

    @Override
    public String toString() {
        String zero = "0";
        if (hours < 10 && minutes < 10 && seconds < 10) {
            return "Time: " + zero + hours + ":" + zero + minutes + ":" + zero + seconds;
        }
        if (hours < 10 && seconds < 10) {
            return "Time: " + zero + hours + ":" + minutes + ":" + zero + seconds;
        }
        if (hours < 10 && minutes < 10) {
            return "Time: " + zero + hours + ":" + zero + minutes + ":" + seconds;
        }
        if (minutes < 10 && seconds < 10) {
            return "Time: " + hours + ":" + zero + minutes + ":" + zero + seconds;
        }
        if (hours < 10) {
            return "Time: " + zero + hours + ":" + minutes + ":" + seconds;
        }
        if (minutes < 10) {
            return "Time: " + hours + ":" + zero + minutes + ":" + seconds;
        }
        if (seconds < 10) {
            return "Time: " + hours + ":" + minutes + ":" + zero + seconds;
        }
        return "Time: " + hours + ":" + minutes + ":" + seconds;
    }

    private int checkForValidityHour(int value) {
        int result = value;
        if (value > 23 || value < 1) {
            result = 0;
        }
        return result;
    }

    private int checkForValidityMinSec(int value) {
        int result = value;
        if (value > 59 || value < 1) {
            result = 0;
        }
        return result;
    }

    public void changeHours(String forwardOrBack, int value) {
        if (forwardOrBack.equalsIgnoreCase("Forward")) {
            hours = checkForValidityHour(hours + value);
        }
        if (forwardOrBack.equalsIgnoreCase("Back")) {
            hours = checkForValidityHour(hours - value);
        }
    }

    public void changeMinutes(String forwardOrBack, int value) {
        if (forwardOrBack.equalsIgnoreCase("Forward")) {
            minutes = checkForValidityMinSec(minutes + value);
        }
        if (forwardOrBack.equalsIgnoreCase("Back")) {
            minutes = checkForValidityMinSec(minutes - value);
        }
    }

    public void changeSeconds(String forwardOrBack, int value) {
        if (forwardOrBack.equalsIgnoreCase("Forward")) {
            seconds = checkForValidityMinSec(seconds + value);
        }
        if (forwardOrBack.equalsIgnoreCase("Back")) {
            seconds = checkForValidityMinSec(seconds - value);
        }
    }
}
