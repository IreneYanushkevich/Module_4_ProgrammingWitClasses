package by.epam.yanushkevich_irina.module4.task2_4.entity;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private int id;
    private String name;
    private List<BankAccount> accounts;

    {
        accounts = new ArrayList<>();
    }

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
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

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Client client = (Client) ob;
        if (name == null) {
            if (client.name != null) {
                return false;
            }
        } else if (!name.equals(client.name)) {
            return false;
        }
        if (accounts == null) {
            if (client.accounts != null) {
                return false;
            }
        } else if (!accounts.equals(client.accounts)) {
            return false;
        }
        return id == client.id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
        result = prime * result + id;
        return result;
    }

    @Override
    public String toString() {
        return "\nClient id: " + id + ", name " + name + ", has the following accounts in this bank: " + accounts + "\n";
    }
}
