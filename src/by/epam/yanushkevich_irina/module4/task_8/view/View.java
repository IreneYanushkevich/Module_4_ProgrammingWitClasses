package by.epam.yanushkevich_irina.module4.task_8.view;

import by.epam.yanushkevich_irina.module4.task_8.entity.Customer;

import java.util.List;

public class View {

    public void print(String text, List<Customer> customers) {
        System.out.println(text + customers + "\n");
        System.out.println("____________________________________________________________________________");
    }
}
