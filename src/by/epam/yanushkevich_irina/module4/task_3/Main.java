package by.epam.yanushkevich_irina.module4.task_3;


public class Main {

   /* 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
         из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
         номеров групп студентов, имеющих оценки, равные только 9 или 10. */

    public static void main(String[] args) {

        Student s1 = new Student("Ivanov I.I.", 18, new int[]{7, 8, 9, 10, 7});
        Student s2 = new Student("Petrov P.P.", 13, new int[]{4, 5, 6, 7, 8});
        Student s3 = new Student("Zayac O.D.", 14, new int[]{8, 9, 6, 10, 8});
        Student s4 = new Student("Cherny G.V.", 17, new int[]{9, 9, 9, 9, 10});
        Student s5 = new Student("Zelony A.A.", 17, new int[]{10, 10, 9, 9, 9});
        Student s6 = new Student("Sidorov G.A.", 11, new int[]{7, 5, 10, 7, 9});
        Student s7 = new Student("Velichko G.D.", 14, new int[]{6, 10, 6, 7, 8});
        Student s8 = new Student("Bely P.V.", 15, new int[]{6, 5, 6, 7, 9});
        Student s9 = new Student("Malahov P.O.", 13, new int[]{3, 5, 8, 7, 10});
        Student s10 = new Student("Shirokov T.T.", 12, new int[]{9, 9, 10, 10, 10});

        Journal journal = new Journal(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10);

        journal.printBestStudent();
    }
}