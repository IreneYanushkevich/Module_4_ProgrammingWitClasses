package by.epam.yanushkevich_irina.module4.task_7.view;

import by.epam.yanushkevich_irina.module4.task_7.entity.Triangle;
import by.epam.yanushkevich_irina.module4.task_7.entity.YourTriangle;

public class TriangleView {

    public void print(String text, double value) {
        System.out.println(text + value);
    }

    public void print(String text, Triangle triangle) {
        System.out.println(text + triangle);
    }

    public void print(String text, YourTriangle triangle) {
        System.out.println(text + triangle);
    }

    public void print(String text, String coordinates) {
        System.out.println(text + coordinates);
    }
}

