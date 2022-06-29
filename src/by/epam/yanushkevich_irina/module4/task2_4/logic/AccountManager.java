package by.epam.yanushkevich_irina.module4.task2_4.logic;

import by.epam.yanushkevich_irina.module4.task2_4.entity.BankAccount;
import by.epam.yanushkevich_irina.module4.task2_4.entity.Client;
import by.epam.yanushkevich_irina.module4.task2_4.view.View;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {

    public void makePayment(BankAccount account, int amount) {

        if (approveOperation(account, amount)) {
            account.setAmount(account.getAmount() - amount);
            System.out.println(account.getClient().getName() + "! Payment in the amount of " + amount + " " + account.getCurrency() +
                    " was successfully completed. \nCurrent balance of account " + account.getName() +
                    " N" + account.getNumber() + " is " + account.getAmount() + " " + account.getCurrency());
            checkBlocking(account);
            System.out.println("_________________________________________________________________________________________");
        } else {
            if (account.getIsBlocked()) {
                System.out.println(account.getClient().getName() + "! This operation is not available. Your account is blocked (payment limit reached)");
                System.out.println("_________________________________________________________________________________________");
            } else {
                System.out.println(account.getClient().getName() + "! There are not enough funds on your account to make a payment for " + amount +
                        " " + account.getCurrency() + ".\nCurrent balance " + account.getAmount() + " " + account.getCurrency());
                System.out.println("_________________________________________________________________________________________");
            }
        }
    }

    private boolean approveOperation(BankAccount account, int amount) {

        boolean approval;
        int freeSum;

        approval = false;
        freeSum = Math.abs(account.getNegativeLimit() - account.getAmount());

        if (freeSum >= amount) {
            approval = true;
        }
        return approval;
    }

    private void checkBlocking(BankAccount account) {

        boolean status;
        status = account.getIsBlocked();

        if (account.getAmount() == account.getNegativeLimit()) {
            account.setIsBlocked(true);
            if (!status) {
                System.out.println("Your account is blocked");
            }
        } else if (account.getAmount() > account.getNegativeLimit()) {
            account.setIsBlocked(false);
            if (status) {
                System.out.println("Your account is unblocked");
            }
        }
    }

    public void replenishAccount(BankAccount account, int amount) {

        account.setAmount(account.getAmount() + amount);
        System.out.println(account.getClient().getName() + "! Your account " + account.getName() + " N" + account.getNumber() + " has been replenished with " +
                amount + " " + account.getCurrency() + ".\nCurrent balance " + account.getAmount() + " " + account.getCurrency());
        checkBlocking(account);
        System.out.println("_________________________________________________________________________________________");
    }

    public List<BankAccount> findBlockedAccount(Client client) {

        List<BankAccount> blocked = new ArrayList<>();

        for (BankAccount ba : client.getAccounts()) {
            if (ba.getIsBlocked()) {
                blocked.add(ba);
            }
        }
        return blocked;
    }

    public void findBlockedAccount(List<Client> clients) {

        List<BankAccount> accounts;
        accounts = new ArrayList<>(makeOneList(clients));

        for (Client client : clients) {
            for (BankAccount ba : client.getAccounts()) {
                if (!ba.getIsBlocked()) {
                    accounts.remove(ba);
                }
            }
        }
        View.print("All blocked accounts of all clients' of the bank:", accounts);
    }

    public BankAccount findRichAccount(Client client) {

        int max;
        BankAccount rich;

        max = Integer.MIN_VALUE;
        rich = null;

        for (BankAccount ba : client.getAccounts()) {
            if (ba.getAmount() > max) {
                max = ba.getAmount();
                rich = ba;
            }
        }
        return rich;
    }

    public void findRichAccount(List<Client> clients) {

        int max;
        BankAccount rich;
        String client;

        max = Integer.MIN_VALUE;
        rich = null;
        client = null;

        for (Client cl : clients) {
            for (int j = 0; j < cl.getAccounts().size(); j++) {
                if (cl.getAccounts().get(j).getAmount() >= max) {
                    max = cl.getAccounts().get(j).getAmount();
                    rich = cl.getAccounts().get(j);
                    client = cl.getName();
                }
            }
        }
        View.print("The most rich client's account of all bank: ", client, rich);
    }


    public List<BankAccount> sortByAmount(Client client) {

        List<BankAccount> bankAccounts;
        bankAccounts = new ArrayList<>(client.getAccounts());

        for (int i = 0; i < bankAccounts.size() - 1; i++) {
            for (int j = i + 1; j < bankAccounts.size(); j++) {
                if (bankAccounts.get(i).getAmount() > bankAccounts.get(j).getAmount()) {
                    BankAccount temp = bankAccounts.get(i);
                    bankAccounts.set(i, bankAccounts.get(j));
                    bankAccounts.set(j, temp);
                }
            }
        }
        return bankAccounts;
    }

    public void sortByAmount(List<Client> clients) {

        List<BankAccount> bankAccounts;
        bankAccounts = new ArrayList<>(makeOneList(clients));

        for (int i = 0; i < bankAccounts.size() - 1; i++) {
            for (int j = i + 1; j < bankAccounts.size(); j++) {
                if (bankAccounts.get(i).getAmount() > bankAccounts.get(j).getAmount()) {
                    BankAccount temp = bankAccounts.get(i);
                    bankAccounts.set(i, bankAccounts.get(j));
                    bankAccounts.set(j, temp);
                }
            }
        }
        View.print("Accounts are sorted by amounts of all clients' of the bank: ", bankAccounts);
    }

    public List<BankAccount> makeOneList(List<Client> clients) {

        List<BankAccount> accounts = new ArrayList<>();

        for (Client client : clients) {
            accounts.addAll(client.getAccounts());
        }
        return accounts;
    }

    public void findCommonSum(List<Client> clients) {

        List<BankAccount> accounts;
        int sum;

        accounts = new ArrayList<>(makeOneList(clients));
        sum = 0;

        for (BankAccount ba : accounts) {
            sum += ba.getAmount();
        }
        View.print("Total amount of account balances, USD, of all clients' of the bank: ", sum);
    }

    public int findCommonSum(Client client) {

        int sum = 0;

        for (BankAccount ba : client.getAccounts()) {
            sum += ba.getAmount();
        }
        return sum;
    }


    public int findSumPositive(Client client) {

        int sum = 0;

        for (BankAccount ba : client.getAccounts()) {
            if (ba.getAmount() > 0) {
                sum += ba.getAmount();
            }
        }
        return sum;
    }

    public void findSumPositive(List<Client> clients) {

        List<BankAccount> accounts;
        int sum;

        accounts = new ArrayList<>(makeOneList(clients));
        sum = 0;

        for (BankAccount ba : accounts) {
            if (ba.getAmount() > 0) {
                sum += ba.getAmount();
            }
        }
        View.print("Amount of all positive account balances, USD, of all clients' of the bank: ", sum);
    }


    public int findSumNegative(Client client) {

        int sum = 0;

        for (BankAccount ba : client.getAccounts()) {
            if (ba.getAmount() < 0) {
                sum += ba.getAmount();
            }
        }
        return sum;
    }

    public void findSumNegative(List<Client> clients) {

        List<BankAccount> accounts;
        int sum;

        accounts = new ArrayList<>(makeOneList(clients));
        sum = 0;

        for (BankAccount ba : accounts) {
            if (ba.getAmount() < 0) {
                sum += ba.getAmount();
            }
        }
        View.print("Amount of all negative account balances, USD, of all clients' of the bank: ", sum);
    }

    public void internalTransfer(BankAccount from, BankAccount to, int sum) {

        System.out.println("Internal translation in progress...");
        makePayment(from, sum);
        System.out.println("Internal translation in progress...");
        replenishAccount(to, sum);
    }
}
