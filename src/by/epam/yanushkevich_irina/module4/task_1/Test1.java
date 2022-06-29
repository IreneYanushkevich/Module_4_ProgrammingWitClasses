package by.epam.yanushkevich_irina.module4.task_1;


public class Test1 {

    /* 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
          переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
          наибольшее значение из этих двух переменных. */

    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "a = " + a + "; b = " + b;
    }

    public int findSum(int a, int b) {
        return a + b;
    }

    public int findMax(int a, int b) {
        return Math.max(a, b);
    }


    public static void main(String[] args) {

        int x = 15;
        int y = 10;

        Test1 t = new Test1();

        t.setA(x);
        t.setB(y);

        System.out.println(t);
        System.out.println("sum = " + t.findSum(x, y));
        System.out.println("max = " + t.findMax(x, y));
    }
}


