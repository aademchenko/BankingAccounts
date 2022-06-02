package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private String name;
    private int age;
    private List<Account> accounts;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
        this.accounts = new ArrayList<>();
    }
    public void addAccount(Account account){
        this.accounts.add(account);
    }
    public List<Account> getAccounts(){
        return accounts;
    }
    public void showAccounts(){
        for(Account account : accounts) {
            System.out.println(account);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && name.equals(client.name) && accounts.equals(client.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, accounts);
    }

}
