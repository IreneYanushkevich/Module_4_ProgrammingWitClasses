package by.epam.yanushkevich_irina.module4.task_5;

public class Main {

    /* 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
          на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
          произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
          позволяющий получить его текущее состояние. Написать код, демонстрирующий все возможности класса. */

    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter(0, 20, 7);

        System.out.println("Counter N1: " + counter1);
        System.out.println("Counter N2: " + counter2);

        counter1.decrease();
        counter2.increase();
        System.out.println("Counter N1: " + counter1);
        System.out.println("Counter N2: " + counter2);

        System.out.println("The current value of the counter N2 = " + counter2.getCurrentValue());

        System.out.println("Counter N2 hash: " + counter2.hashCode());
    }
}
