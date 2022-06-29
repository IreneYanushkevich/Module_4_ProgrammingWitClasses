package by.epam.yanushkevich_irina.module4.task_10.view;

import by.epam.yanushkevich_irina.module4.task_10.entity.Airline;

import java.util.List;

public class View {

    public void print(String text, List<Airline> airlines) {
        System.out.println("\n" + text + airlines);
        System.out.println("_________________________________________________________________________________________");
    }

    public void print(Airline airline) {
        System.out.println(airline);
        System.out.println("_________________________________________________________________________________________");
    }
}
