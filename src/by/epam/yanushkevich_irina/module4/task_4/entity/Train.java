package by.epam.yanushkevich_irina.module4.task_4.entity;

import java.time.LocalTime;


public class Train {

    private String dest;
    private int num;
    private LocalTime time;

    public Train(String dest, int num, LocalTime time) {
        this.dest = dest;
        this.num = num;
        this.time = time;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getDest() {
        return dest;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((time == null) ? 0 : time.hashCode());
        result = prime * result + ((dest == null) ? 0 : dest.hashCode());
        result = prime * result + num;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Train other = (Train) obj;
        if (time == null) {
            if (other.time != null)
                return false;
        } else if (!time.equals(other.time))
            return false;
        if (dest == null) {
            if (other.dest != null)
                return false;
        } else if (!dest.equals(other.dest))
            return false;
        return num == other.num;
    }

    @Override
    public String toString() {
        return "\nTrain [destination: " + dest + ", number " + num + ", departure time: " + time + "]";
    }
}


