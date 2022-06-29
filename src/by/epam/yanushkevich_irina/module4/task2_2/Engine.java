package by.epam.yanushkevich_irina.module4.task2_2;

public class Engine {

    final private int volume;

    public Engine(int volume) {
        this.volume = volume;
    }

    public void startEngine() {
        System.out.println("The engine is started. Trrrr.");
    }

    @Override
    public String toString() {
        return "The volume of the engine equals " + volume + " cm3";
    }
}
