package by.epam.yanushkevich_irina.module4.task2_5.logic;

import by.epam.yanushkevich_irina.module4.task2_5.entity.Nutrition;
import by.epam.yanushkevich_irina.module4.task2_5.entity.Purpose;
import by.epam.yanushkevich_irina.module4.task2_5.entity.Tour;
import by.epam.yanushkevich_irina.module4.task2_5.entity.Transport;

import java.util.ArrayList;
import java.util.List;

public class TourAgencyLogic {

    public List<Tour> chooseByTransport(Transport transport, List<Tour> tours) {

        List<Tour> chosen = new ArrayList<>();

        for (Tour t : tours) {
            if (t.getTransport().equals(transport)) {
                chosen.add(t);
            }
        }
        return chosen;
    }

    public List<Tour> chooseByNutrition(Nutrition nutrition, List<Tour> tours) {

        List<Tour> chosen = new ArrayList<>();

        for (Tour t : tours) {
            if (t.getNutrition().equals(nutrition)) {
                chosen.add(t);
            }
        }
        return chosen;
    }

    public List<Tour> chooseByDuration(int daysFrom, List<Tour> tours) {

        List<Tour> chosen = new ArrayList<>();

        for (Tour t : tours) {
            if (t.getDuration() >= daysFrom) {
                chosen.add(t);
            }
        }
        return chosen;
    }

    public List<Tour> chooseByPurpose(Purpose purpose, List<Tour> tours) {

        List<Tour> chosen = new ArrayList<>();

        for (Tour t : tours) {
            if (t.getPurpose().equals(purpose)) {
                chosen.add(t);
            }
        }
        return chosen;
    }

    public List<Tour> sortByPrice(List<Tour> tours) {

        List<Tour> sorted = new ArrayList<>(tours);

        for (int i = 0; i < tours.size() - 1; i++) {
            for (int j = i; j < tours.size(); j++) {
                if (sorted.get(i).getPrice() > sorted.get(j).getPrice()) {
                    Tour temp = sorted.get(i);
                    sorted.set(i, sorted.get(j));
                    sorted.set(j, temp);
                }
            }
        }
        return sorted;
    }
}
