package by.epam.yanushkevich_irina.module4.task2_5.entity;

import java.util.ArrayList;
import java.util.List;

public class TourAgency {

    private String name;
    private static List<Client> clients;
    private static List<Tour> tours;

    public TourAgency(String name) {
        this.name = name;
        clients = new ArrayList<>();
        tours = new ArrayList<>();
    }

    public void addTour(Tour tour) {
        tours.add(tour);
    }

    public static void addClient(Client client) {
        clients.add(client);
    }

    public static List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        TourAgency.tours = tours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        TourAgency.clients = clients;
    }

    public List<Tour> getCatalog() {
        return tours;
    }

    public void setCatalog(List<Tour> catalog) {
        tours = catalog;
    }

    @Override
    public String toString() {
        return "Tour agency: " + name + ".\nClients: " + clients + ".\nCatalog of all tours:" + tours;
    }
}
