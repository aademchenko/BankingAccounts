package com.company;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("Alex", 56);
        Account account1 = new Account(1236);
        Account account2 = new Account(1110);
        Account account3 = new Account(1059);
        Client client2 = new Client("John", 48);
        Account account4 = new Account(9955);
        Account account5 = new Account(8836);
        client.addAccount(account1);
        client.addAccount(account2);
        client.addAccount(account3);
        client2.addAccount(account4);
        client2.addAccount(account5);
        client2.showAccounts();
//        ArrayList<Account> accounts = (ArrayList<Account>) client.getAccounts();
//        for(Account account : accounts){
//            int number = account.getAccountID();
//            System.out.println(number);
//        }
    }
}
