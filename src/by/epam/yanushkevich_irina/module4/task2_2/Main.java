package by.epam.yanushkevich_irina.module4.task2_2;

public class Main {

    /* 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
          менять колесо, вывести на консоль марку автомобиля. */

    public static void main(String[] args) {

        Engine engine = new Engine(3000);

        Wheel wheel1 = new Wheel("alloy");
        Wheel wheel2 = new Wheel("alloy");
        Wheel wheel3 = new Wheel("alloy");
        Wheel wheel4 = new Wheel("alloy");
        Wheel wheel5 = new Wheel("stepney (alloy)");

        Car car = new Car("BMW", engine, 70);

        car.addWheel(wheel1);
        car.addWheel(wheel2);
        car.addWheel(wheel3);
        car.addWheel(wheel4);

        car.giveCarInfo();
        car.drive();
        car.fillUp(20);
        car.changeWheel(4, wheel5);
        car.printModel();
    }
}
