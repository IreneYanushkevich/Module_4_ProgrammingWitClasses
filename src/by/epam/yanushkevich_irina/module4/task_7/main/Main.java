package by.epam.yanushkevich_irina.module4.task_7.main;

import by.epam.yanushkevich_irina.module4.task_7.view.TriangleView;
import by.epam.yanushkevich_irina.module4.task_7.entity.Triangle;
import by.epam.yanushkevich_irina.module4.task_7.entity.YourTriangle;
import by.epam.yanushkevich_irina.module4.task_7.logic.TriangleLogic;

public class Main {

    /*  7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
           площади, периметра и точки пересечения медиан. */

    public static void main(String[] args) {

        TriangleLogic logic = new TriangleLogic();
        TriangleView view = new TriangleView();

        Triangle t;
        YourTriangle yourTriangle;
        double perimeter;
        double square;
        String median;

        t = new Triangle(0, 0, 0, 3, 4, 0);
        yourTriangle = logic.createTriangle(t);
        perimeter = logic.findPerimeter(yourTriangle);
        square = logic.findSquare(yourTriangle);
        median = logic.findMedianIntersections(t);

        view.print("Triangle coordinates: ", t);
        view.print("My triangle sides: ", yourTriangle);
        view.print("Perimeter = ", perimeter);
        view.print("Square = ", square);
        view.print("Points of intersection of medians: ", median);
    }
}
