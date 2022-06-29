package by.epam.yanushkevich_irina.module4.task2_3.logic;

import by.epam.yanushkevich_irina.module4.task2_3.entity.State;

public class StateLogic {

    public void printCapital(State state) {
        System.out.println("\nThe capital of " + state.getCountryName() + " is " + state.getCapital());
    }

    public void printRegionAmount(State state) {
        System.out.println("\nAmount of the regions = " + state.getRegions().size());
    }

    public void printStateSquare(State state) {
        int square = 0;
        for (int i = 0; i < state.getRegions().size(); i++) {
            square += state.getRegions().get(i).getSquare();
        }
        System.out.println("\nSquare of " + state.getCountryName() + " = " + square + " km2.");
    }

    public void printRegionalCenters(State state) {
        System.out.println("\nRegional centers: ");
        for (int i = 0; i < state.getRegions().size(); i++) {
            System.out.println(state.getRegions().get(i).getRegionalСenter());
        }
    }
}
