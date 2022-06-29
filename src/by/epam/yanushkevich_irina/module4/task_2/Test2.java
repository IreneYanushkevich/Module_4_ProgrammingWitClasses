package by.epam.yanushkevich_irina.module4.task_2;

public class Test2 {

    /* 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
          конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей
          экземпляра класса. */

    private int x;
    private int y;

    Test2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Test2() {
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "a = " + x + "; b = " + y;
    }


    public static void main(String[] args) {

        int x = 1;
        int y = 2;

        Test2 t2 = new Test2();
        Test2 t22 = new Test2(x, y);

        System.out.println(t2);
        System.out.println(t22);
    }
}
