package com.vaishnavi.practice.spring.service;

import com.vaishnavi.practice.spring.model.Account;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ATMService {
    private Account account;

    public void setAccount(Account account) {
        this.account = account;
    }

    public void showBalance() {
        System.out.println("Account Balance: ₹" + account.getBalance());
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposited ₹" + amount + " successfully.");
        showBalance();
    }

    public void withdraw(double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrew ₹" + amount + " successfully.");
        } else {
            System.out.println("Insufficient Balance!");
        }
        showBalance();
    }
}
