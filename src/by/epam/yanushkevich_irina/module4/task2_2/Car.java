package by.epam.yanushkevich_irina.module4.task2_2;

import java.util.ArrayList;
import java.util.List;

public class Car {

    final private String model;
    final private int tankСapacity;
    final private List<Wheel> wheels;
    final private Engine engine;


    {
        wheels = new ArrayList<>(4);
    }

    public Car(String model, Engine engine, int tankСapacity) {
        this.model = model;
        this.engine = engine;
        this.tankСapacity = tankСapacity;
    }

    public void addWheel(Wheel wheel) {
        wheels.add(wheel);
    }

    public void drive() {
        engine.startEngine();
        for (Wheel wheel : wheels) {
            wheel.spin();
        }
        System.out.println("The car is driving now");
    }

    public void changeWheel(int position, Wheel newWheel) {
        if (position < 0 || position > wheels.size() - 1) {
            System.out.println("There isn't such wheel for changing.");
        } else {
            wheels.set(position, newWheel);
            System.out.println("The wheel N " + position + " is changed on " + newWheel.getDisk());
        }
    }

    public void fillUp(int liters) {
        if (liters == tankСapacity) {
            System.out.println("Car has a full tank");
        } else if (liters < tankСapacity) {
            System.out.println("The car was filled with " + liters + " l.");
        } else if (liters > tankСapacity) {
            System.out.println("Car has a full tank. You can't fill more than " + tankСapacity + "l.");
        }
    }

    public void printModel() {
        System.out.println("The model of the car is " + model);
    }

    public void giveCarInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "The model of the car is " + model + ". " + engine + ". Tank capacity is " + tankСapacity + " l. " +
                wheels.get(0) + " - " + wheels.size() + " pcs.";
    }
}
