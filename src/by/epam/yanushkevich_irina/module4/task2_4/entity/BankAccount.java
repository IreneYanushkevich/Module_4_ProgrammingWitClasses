package by.epam.yanushkevich_irina.module4.task2_4.entity;

public class BankAccount {

    private String name;
    private int number;
    private int amount;
    private String currency;
    private boolean isBlocked; // false - unblocked, true - blocked
    private int negativeLimit;
    final private Client client;

    public BankAccount(String name, int number, int amount, String currency, boolean isBlocked, int negativeLimit, Client client) {
        this.name = name;
        this.number = number;
        this.amount = amount;
        this.currency = currency;
        this.isBlocked = isBlocked;
        this.negativeLimit = negativeLimit;
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public int getNegativeLimit() {
        return negativeLimit;
    }

    public void setNegativeLimit(int negativeLimit) {
        this.negativeLimit = negativeLimit;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        }
        if (ob == null || getClass() != ob.getClass()) {
            return false;
        }
        BankAccount ba = (BankAccount) ob;
        if (name == null) {
            if (ba.name != null) {
                return false;
            }
        } else if (!name.equals(ba.name)) {
            return false;
        }
        if (currency == null) {
            if (ba.currency != null) {
                return false;
            }
        } else if (!currency.equals(ba.currency)) {
            return false;
        }
        if (client == null) {
            if (ba.client != null) {
                return false;
            }
        } else if (!client.equals(ba.client)) {
            return false;
        }
        return number == ba.number && amount == ba.amount && negativeLimit == ba.negativeLimit && isBlocked == ba.isBlocked;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((currency == null) ? 0 : currency.hashCode());
        result = prime * result + ((client == null) ? 0 : client.hashCode());
        result = prime * result + number;
        result = prime * result + amount;
        result = prime * result + negativeLimit;
        result = prime * result + (isBlocked ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\nAccount " + name + ", N" + number + ": balance = " + amount + " " + currency +
                ", blocking status: " + isBlocked + ", negative limit = " + negativeLimit;
    }
}
