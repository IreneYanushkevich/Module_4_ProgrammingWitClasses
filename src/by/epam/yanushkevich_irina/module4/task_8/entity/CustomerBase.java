package by.epam.yanushkevich_irina.module4.task_8.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerBase {

    private List<Customer> customers;

    {
        customers = new ArrayList<>();
    }

    public CustomerBase() {
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerBase that = (CustomerBase) o;
        if (customers == null) {
            return that.customers == null;
        } else return customers.equals(that.customers);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customers == null) ? 0 : customers.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "CustomerBase:\n" + customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
