package by.epam.yanushkevich_irina.module4.task_9.view;

import by.epam.yanushkevich_irina.module4.task_9.entity.Book;

import java.util.List;

public class View {

    public void print(String text, List<Book> books) {
        System.out.println(text + books);
        System.out.println("___________________________________________________________________________________________________");
    }
}
