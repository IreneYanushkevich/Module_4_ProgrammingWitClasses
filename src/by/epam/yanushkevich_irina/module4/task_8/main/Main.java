package by.epam.yanushkevich_irina.module4.task_8.main;

import by.epam.yanushkevich_irina.module4.task_8.view.View;
import by.epam.yanushkevich_irina.module4.task_8.entity.Customer;
import by.epam.yanushkevich_irina.module4.task_8.entity.CustomerBase;
import by.epam.yanushkevich_irina.module4.task_8.logic.CustomerLogic;

import java.util.List;

public class Main {

    /* 8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
       и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
       и методами. Задать критерии выбора данных и вывести эти данные на консоль.
       Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
       Найти и вывести:
       a) список покупателей в алфавитном порядке;
       b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.  */

    public static void main(String[] args) {

        CustomerBase base = new CustomerBase();
        CustomerLogic logic = new CustomerLogic();
        View view = new View();

        base.addCustomer(new Customer(123456, "TUROV", "OLEG", "IVANOVICH",
                "SHIROKAYA , 11-12",4894564700001235L, 1234567890123000784L));
        base.addCustomer(new Customer(234567, "IVANOV", "IVAN", "ILICH",
                "POBEDITELEY , 101-34", 5896354702026547L, 4582369314710225896L));
        base.addCustomer(new Customer(345678,"PETROV", "ARTYR", "VLADIMIROVICH",
                "MAVRA , 31-11",3825369614741236L, 2369785213697854789L));
        base.addCustomer(new Customer(456789, "KIROV", "YAN", "DMITRIEVICH",
                "SVETLAYA , 3-13",2521000012369875L, 4545696985851232458L));
        base.addCustomer(new Customer(56789,"BELYAEV", "VASILIY", "DMITRIEVICH",
                "GORNAYA , 30-3",1258963674589632L, 3145656585852525698L));

        List<Customer> sortedBySurname;
        List<Customer> foundByCard;

        sortedBySurname = logic.sortBySurname(base.getCustomers());
        foundByCard = logic.findCustomersByCard(base.getCustomers(), 4900000000000000L, 2000000000000000L);

        view.print("Customer base sorted by surname", sortedBySurname);
        view.print("List of customer formed by credit card number interval", foundByCard);
    }
}
