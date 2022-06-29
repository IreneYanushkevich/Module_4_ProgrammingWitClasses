package by.epam.yanushkevich_irina.module4.task_6;

public class Main {

    /* 6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
       изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
       недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
       заданное количество часов, минут и секунд.  */

    public static void main(String[] args) {

        Time time = new Time(10, 15, 23);
        System.out.println(time);
        time.setHours(13);
        time.setMinutes(61);
        time.setSeconds(19);
        System.out.println(time);
        time.changeHours("back", 15);
        time.changeMinutes("forward", 20);
        time.changeSeconds("back", 15);
        System.out.println(time);
    }
}
