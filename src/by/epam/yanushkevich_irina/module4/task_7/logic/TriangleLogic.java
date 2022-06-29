package by.epam.yanushkevich_irina.module4.task_7.logic;

import by.epam.yanushkevich_irina.module4.task_7.entity.Triangle;
import by.epam.yanushkevich_irina.module4.task_7.entity.YourTriangle;

public class TriangleLogic {

    public double findSquare(YourTriangle triangle) {
        double p = findPerimeter(triangle) / 2;
        return Math.sqrt(p * (p - triangle.getSideA()) * (p - triangle.getSideB()) * (p - triangle.getSideC()));
    }

    public double findPerimeter(YourTriangle triangle) {
        return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
    }

    public YourTriangle createTriangle(Triangle t) {
        double sideA = findSide(t.getXa(), t.getYa(), t.getXb(), t.getYb());
        double sideB = findSide(t.getXb(), t.getYb(), t.getXc(), t.getYc());
        double sideC = findSide(t.getXa(), t.getYa(), t.getXc(), t.getYc());
        return new YourTriangle(sideA, sideB, sideC);
    }

    public double findSide(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public String findMedianIntersections(Triangle t) {
        double x = (t.getXa() + t.getXb() + t.getXc()) / 3;
        double y = (t.getYa() + t.getYb() + t.getYc()) / 3;
        return "(" + x + "; " + y + ")";
    }
}
