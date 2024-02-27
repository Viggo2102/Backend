package BankApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    Map<Integer, Account> acoounts = new HashMap<>();
    //ArrayList<Account> list = new ArrayList<>();


    public void createAccounts(Integer number, double balance, String name) {
        //list.add(new Account(number, balance, name));

        acoounts.put(number, new Account(number, balance, name));

        }
        public Account acoountInfo(int accountnumber) {
        return acoounts.get(accountnumber);
        }

        public void transferBetweenAccounts(int senderAccountNr, int receiverAccountNr, double amount) {
        Account sender = acoounts.get(senderAccountNr);
        Account receiver = acoountInfo(receiverAccountNr);
        sender.transferMoney(receiver,amount);
        }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.createAccounts(1,5000,"Viggo beck");
        b.createAccounts(4, 10000, "Viktor Rasmussen");
        System.out.println(b.acoounts);
        System.out.println(b.acoountInfo(4));
        b.transferBetweenAccounts(1,4,2000);
        System.out.println(b.acoounts.get(1));

    }
}
