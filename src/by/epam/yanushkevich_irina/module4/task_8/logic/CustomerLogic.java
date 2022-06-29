package by.epam.yanushkevich_irina.module4.task_8.logic;

import by.epam.yanushkevich_irina.module4.task_8.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {

    public List<Customer> sortBySurname(List<Customer> customers) {
        List<Customer> sorted = new ArrayList<>(customers);
        for (int i = 0; i < customers.size() - 1; i++) {
            for (int j = i; j < customers.size(); j++) {
                if (sorted.get(i).getSurname().compareTo(sorted.get(j).getSurname()) > 0) {
                    Customer temp = sorted.get(j);
                    sorted.set(j, sorted.get(i));
                    sorted.set(i, temp);
                }
            }
        }
        return sorted;
    }

    public List<Customer> findCustomersByCard(List<Customer> customers, long from, long to) {
        if (from > to) {
            long temp = from;
            from = to;
            to = temp;
        }
        List<Customer> found = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getCard() >= from && customer.getCard() <= to) {
                found.add(customer);
            }
        }
        return sortByCardNumber(found);
    }

    public List<Customer> sortByCardNumber(List<Customer> customers) {
        List<Customer> sorted = new ArrayList<>(customers);
        for (int i = 0; i < customers.size() - 1; i++) {
            for (int j = i; j < customers.size(); j++) {
                if (sorted.get(i).getCard() > (sorted.get(j).getCard())) {
                    Customer temp = sorted.get(j);
                    sorted.set(j, sorted.get(i));
                    sorted.set(i, temp);
                }
            }
        }
        return sorted;
    }
}
