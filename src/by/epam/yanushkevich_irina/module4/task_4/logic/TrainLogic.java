package by.epam.yanushkevich_irina.module4.task_4.logic;

import by.epam.yanushkevich_irina.module4.task_4.entity.Train;

import java.util.ArrayList;
import java.util.List;

public class TrainLogic {

    public List<Train> sortByNumber(List<Train> trains) {
        List<Train> sortedTrains = new ArrayList<>(trains);
        for (int i = 0; i < sortedTrains.size(); i++) {
            for (int j = sortedTrains.size() - 1; i < j; j--) {
                if (sortedTrains.get(i).getNum() > sortedTrains.get(j).getNum()) {
                    Train temp = sortedTrains.get(i);
                    sortedTrains.set(i, sortedTrains.get(j));
                    sortedTrains.set(j, temp);
                }
            }
        }
        return sortedTrains;
    }

    public Train findByNumber(int number, List<Train> trains) {
        Train train = null;
        for (Train value : trains) {
            if (value.getNum() == number) {
                train = value;
            }
        }
        return train;
    }

    public List<Train> sortByDestination(List<Train> trains) {
        List<Train> sortedTrains = new ArrayList<>(trains);
        for (int i = 0; i < trains.size() - 1; i++) {
            for (int j = i + 1; j < trains.size(); j++) {
                if (sortedTrains.get(i).getDest().compareTo(sortedTrains.get(j).getDest()) > 0) {
                    Train temp = sortedTrains.get(j);
                    sortedTrains.set(j, sortedTrains.get(i));
                    sortedTrains.set(i, temp);
                } else if (sortedTrains.get(i).getDest().compareTo(sortedTrains.get(j).getDest()) == 0) {
                    sortByTime(sortedTrains, i, j);
                }
            }
        }
        return sortedTrains;
    }

    private void sortByTime(List<Train> trains, int indOne, int indTwo) {
        if(trains.get(indOne).getTime().isAfter(trains.get(indTwo).getTime())) {
            Train temp = trains.get(indOne);
            trains.set(indOne, trains.get(indTwo));
            trains.set(indTwo, temp);
        }
    }
}
