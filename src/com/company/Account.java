package com.company;

import java.util.Objects;

public class Account {
    private int accountID;
    private int goldCoins;
//    private Client client;

    public Account(int accountID) {
        this.accountID = accountID;
//        this.client = client;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getGoldCoins() {
        return goldCoins;
    }

    public void setGoldCoins(int goldCoins) {
        this.goldCoins = goldCoins;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", goldCoins=" + goldCoins +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountID == account.accountID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountID);
    }
}
