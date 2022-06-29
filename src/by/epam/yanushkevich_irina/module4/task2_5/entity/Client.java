package by.epam.yanushkevich_irina.module4.task2_5.entity;


public class Client {

    private String name;
    private Tour tour;

    public Client(String name, Tour tour) {
        this.name = name;
        this.tour = tour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    @Override
    public String toString() {
        return "\nClient: " + name + ", choose tour: " + tour;
    }
}
