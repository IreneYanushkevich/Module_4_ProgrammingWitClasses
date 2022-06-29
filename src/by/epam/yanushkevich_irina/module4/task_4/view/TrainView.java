package by.epam.yanushkevich_irina.module4.task_4.view;

import by.epam.yanushkevich_irina.module4.task_4.entity.Train;

import java.util.List;

public class TrainView {

    public void print(String text, List<Train> trains) {
        System.out.println(text + trains);
    }

    public void print(Train train) {
        System.out.println(train);
    }
}

