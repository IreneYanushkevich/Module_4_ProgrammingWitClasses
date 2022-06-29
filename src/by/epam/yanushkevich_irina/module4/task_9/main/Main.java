package by.epam.yanushkevich_irina.module4.task_9.main;

import by.epam.yanushkevich_irina.module4.task_9.view.View;
import by.epam.yanushkevich_irina.module4.task_9.entity.Book;
import by.epam.yanushkevich_irina.module4.task_9.entity.Library;
import by.epam.yanushkevich_irina.module4.task_9.logic.BookLogic;

import java.util.List;

public class Main {

    /* 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
          метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
          методами. Задать критерии выбора данных и вывести эти данные на консоль.
          Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
          Найти и вывести:
          a) список книг заданного автора;
          b) список книг, выпущенных заданным издательством;
          c) список книг, выпущенных после заданного года.  */

    public static void main(String[] args) {

        Library library = new Library();
        BookLogic logic = new BookLogic();
        View view = new View();

        library.addBook(new Book(1234, "Happiness", "Ivanov", "Solnyshko", 2011,
                100, 126.6, "softcover"));
        library.addBook(new Book(1456, "Something", "Ivanov", "Boooooks", 2020,
                150, 186.6, "softcover"));
        library.addBook(new Book(89234, "Hobbies", "Vielikiy", "Rainbow", 1998,
                1000, 450., "hardcover"));
        library.addBook(new Book(58582, "Adventures", "Gorkiy", "Solnyshko", 2015,
                300, 200.0, "hardcover"));
        library.addBook(new Book(96327, "Weekends", "Petrov", "World", 2000,
                500, 521.25, "hardcover"));

        List<Book> booksByAuthor;
        List<Book> booksByPublisher;
        List<Book> booksByYear;

        booksByAuthor = logic.makeListByAuthor(library.getBooks(), "Ivanov");
        booksByPublisher = logic.makeListByPublisher(library.getBooks(), "Solnyshko");
        booksByYear = logic.makeListByYear(library.getBooks(), 2010);

        view.print("List of books by the chosen author: ", booksByAuthor);
        view.print("List of books of the chosen publisher: ", booksByPublisher);
        view.print("List of books published after the given year: ", booksByYear);
    }
}
