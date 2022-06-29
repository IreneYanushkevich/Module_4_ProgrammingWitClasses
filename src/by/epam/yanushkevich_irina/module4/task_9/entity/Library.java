package by.epam.yanushkevich_irina.module4.task_9.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    {
        books = new ArrayList<>();
    }

    public Library() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        if (books == null) {
            return library.books == null;
        } else return books.equals(library.books);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((books == null) ? 0 : books.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "\nLibrary contains next books:\n" + books;
    }
}
