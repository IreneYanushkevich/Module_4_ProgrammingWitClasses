package by.epam.yanushkevich_irina.module4.task2_5.main;

import by.epam.yanushkevich_irina.module4.task2_5.entity.*;
import by.epam.yanushkevich_irina.module4.task2_5.logic.Menu;

public class Main {

    /* 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
          различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
          возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.  */

    public static void main(String[] args) {

        TourAgency agent = new TourAgency("VOYAGE");
        Menu menu = new Menu();

        agent.addTour(new Tour("PORTUGAL", Purpose.CRUISE, 12, Transport.SHIP, Nutrition.ALL_INCLUSIVE, 2500));
        agent.addTour(new Tour("BELARUS", Purpose.EXCURSION, 3, Transport.BUS, Nutrition.SELF_CATERING, 200));
        agent.addTour(new Tour("GOA", Purpose.RECREATION, 10, Transport.AIRPLANE, Nutrition.BREAKFAST, 1500));
        agent.addTour(new Tour("POLAND", Purpose.SHOPPING, 4, Transport.BUS, Nutrition.SELF_CATERING, 500));
        agent.addTour(new Tour("TURKEY", Purpose.TREATMENT, 14, Transport.AIRPLANE, Nutrition.ALL_INCLUSIVE, 3000));
        agent.addTour(new Tour("SPAIN", Purpose.CRUISE, 7, Transport.SHIP, Nutrition.ALL_INCLUSIVE, 1900));
        agent.addTour(new Tour("LITHUANIA", Purpose.EXCURSION, 5, Transport.BUS, Nutrition.BREAKFAST, 450));
        agent.addTour(new Tour("GREECE", Purpose.TREATMENT, 8, Transport.AIRPLANE, Nutrition.ALL_INCLUSIVE, 2000));

        menu.mainQuestion();
    }
}
