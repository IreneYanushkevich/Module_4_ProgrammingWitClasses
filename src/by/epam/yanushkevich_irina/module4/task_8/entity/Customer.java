package by.epam.yanushkevich_irina.module4.task_8.entity;

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private long card;
    private long accNumber;

    public Customer() {
    }

    public Customer(int id, String surname, String name, String patronymic, String address, long card, long accNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.card = card;
        this.accNumber = accNumber;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCard() {
        return card;
    }

    public void setCard(long card) {
        this.card = card;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    @Override
    public String toString() {
        return "\n\n" + "Customer id: " + id + "\n" +
                "surname " + surname + "   name " + name + "   patronymic " + patronymic + "\n" +
                "address: " + address + "\n" +
                "credit card N" + card + ", bank account N" + accNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer c = (Customer) o;
        if (surname == null) {
            if (c.surname != null) {
                return false;
            }
        } else if (!surname.equals(c.surname)) {
            return false;
        }
        if (name == null) {
            if (c.name != null) {
                return false;
            }
        } else if (!name.equals(c.name)) {
            return false;
        }
        if (patronymic == null) {
            if (c.patronymic != null) {
                return false;
            }
        } else if (!patronymic.equals(c.patronymic)) {
            return false;
        }
        if (address == null) {
            if (c.address != null) {
                return false;
            }
        } else if (!address.equals(c.address)) {
            return false;
        }
        return id == c.id && card == c.card && accNumber == c.accNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + id;
        result = prime * result + (int)card;
        result = prime * result + (int) accNumber;
        return result;
    }
}
