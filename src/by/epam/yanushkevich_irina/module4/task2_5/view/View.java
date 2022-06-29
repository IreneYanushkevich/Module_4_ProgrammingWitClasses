package by.epam.yanushkevich_irina.module4.task2_5.view;

import by.epam.yanushkevich_irina.module4.task2_5.entity.Tour;

import java.util.List;

public class View {

    public void print(String notice, List<Tour> tours) {
        System.out.println(notice + tours);
        System.out.println("_________________________________________________________________________________________");
    }

    public void print(String notice, Tour tour) {
        System.out.println(notice + tour);
        System.out.println("_________________________________________________________________________________________");
    }

    public void print(Object ob) {
        System.out.println(ob);
        System.out.println("_________________________________________________________________________________________");
    }

    public void print(String name, String notice, Tour tour) {
        System.out.println(name + notice + tour);
        System.out.println("_________________________________________________________________________________________");
    }
}
