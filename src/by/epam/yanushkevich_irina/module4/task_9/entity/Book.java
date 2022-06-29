package by.epam.yanushkevich_irina.module4.task_9.entity;

public class Book {

    private int id;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private double price;
    private String binding;

    public Book() {
    }

    public Book(int id, String name, String author, String publisher, int year, int pages, double price, String binding) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if (name == null) {
            if (book.name != null) {
                return false;
            }
        } else if (!name.equals(book.name)) {
            return false;
        }
        if (author == null) {
            if (book.author != null) {
                return false;
            }
        } else if (!author.equals(book.author)) {
            return false;
        }
        if (publisher == null) {
            if (book.publisher != null) {
                return false;
            }
        } else if (!publisher.equals(book.publisher)) {
            return false;
        }
        if (binding == null) {
            if (book.binding != null) {
                return false;
            }
        } else if (!binding.equals(book.binding)) {
            return false;
        }
        return id == book.id && year == book.year && pages == book.pages && Double.compare(book.price, price) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + year;
        result = prime * result + pages;
        result = prime * result + (int) price;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
        result = prime * result + ((binding == null) ? 0 : binding.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "\nBook {id: " + id + ", name: " + name + ", author: " + author + ", publisher: " + publisher +
                ", year " + year + ", pages " + pages + ", price " + price + "$, binding: " + binding + '}';
    }
}
