package by.epam.yanushkevich_irina.module4.task_7.entity;

public class YourTriangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public YourTriangle() {
    }

    public YourTriangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        YourTriangle your = (YourTriangle) obj;
        return this.sideA == your.sideA && this.sideB == your.sideB && this.sideC == your.getSideC();
    }

    @Override
    public int hashCode() {
        final double prime = 31.0;
        double result = 1.0;
        result = prime * result + sideA;
        result = prime * result + sideB;
        result = prime * result + sideC;
        return (int) result;
    }

    @Override
    public String toString() {
        if (sideA == 0 && sideB == 0 && sideC == 0) {
            return "Such a triangle does not exist";
        }
        return "a = " + sideA + ", b = " + sideB + ", c = " + sideC;
    }
}
