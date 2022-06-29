package by.epam.yanushkevich_irina.module4.task2_2;

public class Wheel {

    final private String disk;

    public Wheel(String disk) {
        this.disk = disk;
    }

    public void spin() {
        System.out.println("The wheel starts spinning.");
    }

    public String getDisk() {
        return disk;
    }

    @Override
    public String toString() {
        return "The wheels have " + disk + " disks";
    }
}
