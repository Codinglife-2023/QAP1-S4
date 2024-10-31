package com.bank;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, Account> accounts = new HashMap<>();
    
    // Create a new account
    public Account createAccount(int accountNumber, double initialBalance) {
        Account account = new Account(accountNumber, initialBalance);
        accounts.put(accountNumber, account);
        return account;
    }
    
    // Find account by account number
    public Account findAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }
    
    // Transfer funds between accounts
    public void transferFunds(int fromAccount, int toAccount, double amount) {
        Account source = accounts.get(fromAccount);
        Account destination = accounts.get(toAccount);
        
        if (source != null && destination != null) {
            source.withdraw(amount);
            destination.deposit(amount);
        } else {
            System.out.println("One or both accounts not found.");
        }
    }
}
