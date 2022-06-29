package by.epam.yanushkevich_irina.module4.task_7.entity;

public class Triangle {

    private double xA;
    private double yA;
    private double xB;
    private double yB;
    private double xC;
    private double yC;

    public Triangle() {
    }
    public Triangle(double xA, double yA, double xB, double yB, double xC, double yC) {
        if ((xB - xA) * (yC - yA) != (xC - xA) * (yB - yA)) {
            this.xA = xA;
            this.yA = yA;
            this.xB = xB;
            this.yB = yB;
            this.xC = xC;
            this.yC = yC;
        }
    }

    public double getXa(){
        return xA;
    }
    public double getYa(){
        return yA;
    }
    public double getXb(){
        return xB;
    }
    public double getYb(){
        return yB;
    }
    public double getXc(){
        return xC;
    }
    public double getYc(){
        return yC;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Triangle o = (Triangle) obj;
        return this.xA == o.xA && this.yA == o.yA && this.xB == o.xB && this.yB == o.yB && this.xC == o.xC && this.yC == o.yC;
    }

    @Override
    public int hashCode() {
        final double prime = 31.0;
        double result = 1.0;
        result = prime * result + xA;
        result = prime * result + yA;
        result = prime * result + xB;
        result = prime * result + yB;
        result = prime * result + xC;
        result = prime * result + yC;
        return (int)result;
    }

    @Override
    public String toString() {
        if (xA == 0 && yA == 0 && xB == 0 && yB == 0 && xC == 0 && yC == 0) {
            return " You have set the coordinates of a non-existent triangle";
        } else {
            return "A(" + xA + "; " + yA + "), B(" + xB + "; " + yB + "), C(" + xC + "; " + yC + ")";
        }
    }
}
