package by.epam.yanushkevich_irina.module4.task2_5.logic;

import by.epam.yanushkevich_irina.module4.task2_5.view.View;
import by.epam.yanushkevich_irina.module4.task2_5.entity.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    View view = new View();
    TourAgencyLogic logic = new TourAgencyLogic();

    public void mainQuestion() {

        int answer;
        answer = scanNum(0, 6, ask());

        switch (answer) {
            case 1:
                List<Tour> chosenByTransport = logic.chooseByTransport(chooseTransport(), TourAgency.getTours());
                registration(chosenByTransport);
                break;
            case 2:
                List<Tour> chosenByNutrition = logic.chooseByNutrition(chooseNutrition(), TourAgency.getTours());
                registration(chosenByNutrition);
                break;
            case 3:
                List<Tour> chosenByDuration = logic.chooseByDuration(chooseDuration(), TourAgency.getTours());
                registration(chosenByDuration);
                break;
            case 4:
                List<Tour> chosenByPurpose = logic.chooseByPurpose(choosePurpose(), TourAgency.getTours());
                registration(chosenByPurpose);
                break;
            case 5:
                List<Tour> sortedByPrice = logic.sortByPrice(TourAgency.getTours());
                view.print("Tours sorted by price: ", sortedByPrice);
                registration(sortedByPrice);
                break;
            case 0:
                break;
        }
    }

    private String ask() {
        return """
                Dear client! Let's choose a tour for you! Click what interests you (0 - 5):
                1 - Tours chosen by transport
                2 - Tours chosen by nutrition
                3 - Tours chosen by duration
                4 - Tours chosen by purpose
                5 - Tours sorted by price
                0 - exit""";
    }

    private String askTransport() {
        return """
                Choose transport (0 - 3):
                1 - bus
                2 - airline
                3 - ship
                0 - back to main menu""";
    }

    private String askNutrition() {
        return """
                Choose nutrition (0 - 3):
                1 - breakfast
                2 - all inclusive
                3 - self catering
                0 - back to main menu""";
    }

    private String askPurpose() {
        return """
                Choose purpose (0 - 5):
                1 - recreation
                2 - excursion
                3 - treatment
                4 - shopping
                5 - cruise
                0 - back to main menu""";
    }

    private Transport chooseTransport() {
        int choice = scanNum(0, 3, askTransport());
        Transport transport = null;

        switch (choice) {
            case 1 -> {
                transport = Transport.BUS;
                view.print("Tours chosen by transport: ", logic.chooseByTransport(transport, TourAgency.getTours()));
            }
            case 2 -> {
                transport = Transport.AIRPLANE;
                view.print("Tours chosen by transport: ", logic.chooseByTransport(transport, TourAgency.getTours()));
            }
            case 3 -> {
                transport = Transport.SHIP;
                view.print("Tours chosen by transport: ", logic.chooseByTransport(transport, TourAgency.getTours()));
            }
            case 0 -> mainQuestion();
        }
        return transport;
    }

    private Nutrition chooseNutrition() {
        int choice = scanNum(0, 3, askNutrition());
        Nutrition nutrition = null;

        switch (choice) {
            case 1 -> {
                nutrition = Nutrition.BREAKFAST;
                view.print("Tours chosen by nutrition: ", logic.chooseByNutrition(nutrition, TourAgency.getTours()));
            }
            case 2 -> {
                nutrition = Nutrition.ALL_INCLUSIVE;
                view.print("Tours chosen by nutrition: ", logic.chooseByNutrition(nutrition, TourAgency.getTours()));
            }
            case 3 -> {
                nutrition = Nutrition.SELF_CATERING;
                view.print("Tours chosen by nutrition: ", logic.chooseByNutrition(nutrition, TourAgency.getTours()));
            }
            case 0 -> mainQuestion();
        }
        return nutrition;
    }

    private int chooseDuration() {
        int min;
        min = scanNum(3, 14, "Enter minimal amount of days for you tour (3 - 14):");
        view.print("Tours chosen by duration: ", logic.chooseByDuration(min, TourAgency.getTours()));
        return min;
    }

    private Purpose choosePurpose() {
        int choice = scanNum(0, 5, askPurpose());
        Purpose purpose = null;

        switch (choice) {
            case 1 -> {
                purpose = Purpose.RECREATION;
                view.print("Tours chosen by purpose: ", logic.chooseByPurpose(purpose, TourAgency.getTours()));
            }
            case 2 -> {
                purpose = Purpose.EXCURSION;
                view.print("Tours chosen by purpose: ", logic.chooseByPurpose(purpose, TourAgency.getTours()));
            }
            case 3 -> {
                purpose = Purpose.TREATMENT;
                view.print("Tours chosen by purpose: ", logic.chooseByPurpose(purpose, TourAgency.getTours()));
            }
            case 4 -> {
                purpose = Purpose.SHOPPING;
                view.print("Tours chosen by purpose: ", logic.chooseByPurpose(purpose, TourAgency.getTours()));
            }
            case 5 -> {
                purpose = Purpose.CRUISE;
                view.print("Tours chosen by purpose: ", logic.chooseByPurpose(purpose, TourAgency.getTours()));
            }
            case 0 -> mainQuestion();
        }
        return purpose;
    }

    private int scanNum(int from, int to, String message) {
        int choice;
        do {
            System.out.println(message);
            while (!scanner.hasNextInt()) {
                System.out.println(message);
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < from || choice > to);
        return choice;
    }

    private void registration(List<Tour> tours) {
        List<Tour> t;
        int choice;

        t = new ArrayList<>(tours);
        t.add(0, null);

        if (tours.size() != 0) {
            System.out.println("Press number of your choice:");
            System.out.println("0 - back to main menu");
            for (int i = 1; i < t.size(); i++) {
                System.out.print(i + " ");
            }
            System.out.println(" - sequence number of the tour");

            choice = scanChoice(t);

            if (t.get(choice) == null || choice == 0) {
                mainQuestion();
            } else {
                view.print("Tour for your request: ", t.get(choice));
                try {
                    TourAgency.addClient(new Client(enterName(), t.get(choice)));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (TourAgency.getClients().get(0).getName() != null) {
                    view.print(TourAgency.getClients().get(0).getName(), "! Congratulations! You became the proud owner of a tour ",
                            TourAgency.getClients().get(0).getTour());
                }
            }
        }
    }

    private int scanChoice(List<Tour> tours) {
        int choice;
        do {
            System.out.println("Press number of your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Press number of your choice: ");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < 0 || choice > tours.size() - 1);
        return choice;
    }

    public String enterName() throws IOException {
        String name;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name for buying this tour or press 0 - for exit: ");
        name = reader.readLine();
        if (name.equals("0")) {
            name = null;
            mainQuestion();
        }
        return name;
    }
}
