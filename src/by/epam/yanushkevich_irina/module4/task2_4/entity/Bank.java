package by.epam.yanushkevich_irina.module4.task2_4.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {

    private String name;
    private List<Client> clients;

    public Bank(String name) {
        this.name = name;
        clients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void addClient(Client... clients) {
        this.clients.addAll(Arrays.asList(clients));
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Bank bank = (Bank) ob;
        if (name == null) {
            if (bank.name != null) {
                return false;
            }
        } else if (!name.equals(bank.name)) {
            return false;
        }
        if (clients == null) {
            if (bank.clients != null) {
                return false;
            }
        }
        assert clients != null;
        return clients.equals(bank.clients);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((clients == null) ? 0 : clients.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Bank: " + name + ", clients:\n" + clients;
    }
}
