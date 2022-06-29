package by.epam.yanushkevich_irina.module4.task_4.main;

import by.epam.yanushkevich_irina.module4.task_4.entity.Depo;
import by.epam.yanushkevich_irina.module4.task_4.entity.Train;
import by.epam.yanushkevich_irina.module4.task_4.logic.TrainLogic;
import by.epam.yanushkevich_irina.module4.task_4.view.TrainView;

import java.time.LocalTime;
import java.util.List;

public class Main {

    /* 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
          Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов
          массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
          пользователем. Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми
          пунктами назначения должны быть упорядочены по времени отправления. */

    public static void main(String[] args) {

        Depo depo = new Depo();
        TrainLogic logic = new TrainLogic();
        TrainView view = new TrainView();

        depo.addTrain(new Train("Minsk", 1458, LocalTime.of(22, 45)));
        depo.addTrain(new Train("Moscow", 1987, LocalTime.of(11, 31)));
        depo.addTrain(new Train("Pinsk", 958, LocalTime.of(21, 20)));
        depo.addTrain(new Train("Minsk", 2041, LocalTime.of(17, 9)));
        depo.addTrain(new Train("Minsk", 3587, LocalTime.of(14, 34)));

        List<Train> sortedByNum;
        sortedByNum = logic.sortByNumber(depo.getTrains());
        view.print("Sorting by number: ", sortedByNum);

        Train train;
        train = logic.findByNumber(1458, depo.getTrains());
        view.print(train);
        System.out.println();

        List<Train> sortedByDest;
        sortedByDest = logic.sortByDestination(depo.getTrains());
        view.print("Sorting by destination: ", sortedByDest);
    }
}
