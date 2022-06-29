package by.epam.yanushkevich_irina.module4.task_10.main;

import by.epam.yanushkevich_irina.module4.task_10.view.View;
import by.epam.yanushkevich_irina.module4.task_10.entity.Airline;
import by.epam.yanushkevich_irina.module4.task_10.entity.Airport;
import by.epam.yanushkevich_irina.module4.task_10.logic.AirportLogic;

import java.time.LocalTime;
import java.util.List;

public class Main {

    /*  10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
            и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
            методами. Задать критерии выбора данных и вывести эти данные на консоль.
            Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
            Найти и вывести:
            a) список рейсов для заданного пункта назначения;
            b) список рейсов для заданного дня недели;
            c) список рейсов для заданного дня недели, время вылета для которых больше заданного.  */

    public static void main(String[] args) {

        Airport airport = new Airport();
        AirportLogic logic = new AirportLogic();
        View view = new View();

        airport.addAirline(new Airline("Minsk", 1256, "Boeing-777",
                LocalTime.of(11, 45), "Monday, Wednesday, Friday"));
        airport.addAirline(new Airline("Moscow", 2536, "Boeing-767",
                LocalTime.of(15, 8), "Tuesday, Thursday, Saturday"));
        airport.addAirline(new Airline("London", 1456, "Airbus A330",
                LocalTime.of(23, 36), "Tuesday, Thursday, Sunday"));
        airport.addAirline(new Airline("Minsk", 4512, "IL-86",
                LocalTime.of(8, 20), "Monday, Saturday, Sunday"));
        airport.addAirline(new Airline("Paris", 1112, "Airbus A330",
                LocalTime.of(12, 12), "Tuesday, Wednesday, Friday"));
        airport.addAirline(new Airline("Moscow", 1515, "Boeing-767",
                LocalTime.of(17, 12), "Monday, Sunday"));

        List<Airline> flightsByDestination;
        List<Airline> flightsByTheDay;
        List<Airline> flightsByTheDayAndTime;

        flightsByDestination = logic.findFlightByDestination(airport.getAirlines(), "Minsk");
        flightsByTheDay = logic.findFlightByDayOfWeek(airport.getAirlines(), "Monday");
        flightsByTheDayAndTime = logic.findFlightByDayOfWeekAdTime(airport.getAirlines(), "Thursday", LocalTime.of(15, 30));

        view.print("The list of flights for chosen destination: ", flightsByDestination);
        view.print("The list of flights for chosen day of week: ", flightsByTheDay);
        view.print("The list of flights for chosen day of week and after chosen time", flightsByTheDayAndTime);
    }
}
