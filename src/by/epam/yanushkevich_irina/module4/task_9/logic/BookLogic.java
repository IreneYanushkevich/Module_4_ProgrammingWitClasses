package by.epam.yanushkevich_irina.module4.task_9.logic;

import by.epam.yanushkevich_irina.module4.task_9.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {

    public List<Book> makeListByAuthor(List<Book> books, String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                booksByAuthor.add(book);
            }
        }
        return sortByName(booksByAuthor);
    }

    public List<Book> makeListByPublisher(List<Book> books, String publisher) {
        List<Book> booksByPublisher = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublisher().equalsIgnoreCase(publisher)) {
                booksByPublisher.add(book);
            }
        }
        return sortByName(booksByPublisher);
    }

    public List<Book> makeListByYear(List<Book> books, int year) {
        List<Book> booksByYear = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() > year) {
                booksByYear.add(book);
            }
        }
        return sortByYear(booksByYear);
    }

    public List<Book> sortByName(List<Book> books) {
        List<Book> sorted = new ArrayList<>(books);
        for (int i = 0; i < books.size() - 1; i++) {
            for (int j = i; j < books.size(); j++) {
                if (sorted.get(i).getName().compareTo(sorted.get(j).getName()) > 0) {
                    Book temp = sorted.get(j);
                    sorted.set(j, sorted.get(i));
                    sorted.set(i, temp);
                }
            }
        }
        return sorted;
    }

    public List<Book> sortByYear(List<Book> books) {
        List<Book> sorted = new ArrayList<>(books);
        for (int i = 0; i < sorted.size(); i++) {
            for (int j = sorted.size() - 1; i < j; j--) {
                if (sorted.get(i).getYear() > sorted.get(j).getYear()) {
                    Book temp = sorted.get(i);
                    sorted.set(i, sorted.get(j));
                    sorted.set(j, temp);
                }
            }
        }
        return sorted;
    }
}
