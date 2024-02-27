package BankApp;

import java.util.ArrayList;

public class Account {
    int accountNumber;
    double balance;
    String name;

    Account(int accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }
    public String toString() {
        return accountNumber + " " + balance + " " + name;
    }

    public double depositMoney(double money) {
        return balance+=money;
    }
    public void withdrawMoney(double money) {
        double newBalance = balance - money;
        if (money>balance)  {
            System.out.println("Du har ikke penge nok på kontoen ven!");
        } else System.out.println("Du har hævet " + money + ", din balance er nu: " + newBalance);
        balance-=money;
    }

    public void transferMoney(Account a, double beløb) {
        withdrawMoney(beløb);
        a.depositMoney(beløb);
        System.out.println("DU hr overført: " + beløb + " til " + a);
        }

    public static void main(String[] args) {
        Account a = new Account(1, 1000, "peter");
        Account b = new Account(2, 5000, "Viggo");
        b.transferMoney(a,2000);
        System.out.println(a.depositMoney(500));
        a.withdrawMoney(1000);
    }

}

