package by.epam.yanushkevich_irina.module4.task2_4.main;

import by.epam.yanushkevich_irina.module4.task2_4.entity.Bank;
import by.epam.yanushkevich_irina.module4.task2_4.entity.BankAccount;
import by.epam.yanushkevich_irina.module4.task2_4.entity.Client;
import by.epam.yanushkevich_irina.module4.task2_4.logic.AccountManager;
import by.epam.yanushkevich_irina.module4.task2_4.view.View;

public class Main {

    /*  4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
           счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
           всем счетам, имеющим положительный и отрицательный балансы отдельно.  */

    public static void main(String[] args) {

        Bank bank = new Bank("Alfa-Bank");

        Client client1 = new Client(28051987, "Ivanov Ivan Ivanovich");
        Client client2 = new Client(15121977, "Petrov Piotr Petrovich");

        bank.addClient(client1, client2);

        client1.addAccount(new BankAccount("Accumulation", 123456789, 3000, "USD", false, 0, client1));
        client1.addAccount(new BankAccount("Overdraft", 654987321, -500, "USD", false, -2000, client1));
        client1.addAccount(new BankAccount("CurrentEasy", 753951824, -500, "USD", true, -500, client1));
        client1.addAccount(new BankAccount("CurrentComfort", 758669366, 1400, "USD", false, 0, client1));
        client2.addAccount(new BankAccount("Accumulation", 252525257, 2500, "USD", false, 0, client2));
        client2.addAccount(new BankAccount("Overdraft", 465957582, -2000, "USD", true, -2000, client2));
        client2.addAccount(new BankAccount("CurrentEasy", 142536625, -500, "USD", true, -500, client2));
        client2.addAccount(new BankAccount("CurrentComfort", 545658521, 900, "USD", false, 0, client2));

        AccountManager mng = new AccountManager();

        // Methods for transactions:
        mng.makePayment(client1.getAccounts().get(0), 3000);
        mng.replenishAccount(client1.getAccounts().get(2), 100);
        mng.internalTransfer(client1.getAccounts().get(3), client2.getAccounts().get(2), 1300);

        // Methods of sorting and finding for all clients of the bank:
        mng.findBlockedAccount(bank.getClients());
        mng.findRichAccount(bank.getClients());
        mng.sortByAmount(bank.getClients());
        mng.findCommonSum(bank.getClients());
        mng.findSumPositive(bank.getClients());
        mng.findSumNegative(bank.getClients());

        // Methods of sorting and finding for one of the client of the bank:
        View.print("Blocked accounts of the client's: ", client1.getName(), mng.findBlockedAccount(client1));
        View.print("Account with the highest positive amount of the client's: ", client1.getName(), mng.findRichAccount(client1));
        View.print("Accounts are sorted by amounts of the client's: ", client1.getName(), mng.sortByAmount(client1));
        View.print("Total amount of account balances, USD, of the client's", client2.getName(), mng.findCommonSum(client2));
        View.print("Amount of the positive account balances, USD, of the client's", client2.getName(), mng.findSumPositive(client2));
        View.print("Amount of the negative account balances, USD, of the client's", client2.getName(), mng.findSumNegative(client2));

        View.print(bank);
    }
}
