package by.epam.yanushkevich_irina.module4.task2_4.view;

import by.epam.yanushkevich_irina.module4.task2_4.entity.BankAccount;

import java.util.List;

public class View {

    public static void print(Object ob) {
        System.out.println(ob);
        System.out.println("_________________________________________________________________________________________");
    }

    public static void print(String notice, String name, List<BankAccount> accounts) {
        System.out.print(notice + name);
        for (BankAccount l : accounts) {
            System.out.print(l);
        }
        System.out.println("\n_______________________________________________________________________________________");
    }

    public static void print(String notice, List<BankAccount> accounts) {
        System.out.println(notice);
        for (BankAccount l : accounts) {
            System.out.print(l.getClient().getName() + l + "\n");
        }
        System.out.println("_________________________________________________________________________________________");
    }

    public static void print(String notice, BankAccount accounts) {
        System.out.println(notice + accounts);
        System.out.println("_________________________________________________________________________________________");
    }

    public static void print(String notice, String s, BankAccount accounts) {
        System.out.println(notice + s + accounts);
        System.out.println("_________________________________________________________________________________________");
    }

    public static void print(String notice, String name, int num) {
        System.out.println(notice + " : " + name + ": " + num);
        System.out.println("_________________________________________________________________________________________");
    }

    public static void print(String notice, int num) {
        System.out.println(notice + num);
        System.out.println("_________________________________________________________________________________________");
    }
}
