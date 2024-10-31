
package com.bank;

import org.junit.Assert;
import org.junit.Test;

public class BankTest {

    // Test account creation
    @Test
    public void testAccountCreation() {
        Bank bank = new Bank();
        Account account = bank.createAccount(1, 100.0);
        Assert.assertNotNull("Account should be created", account);
        Assert.assertEquals("Initial balance should match", 100.0, account.getBalance(), 0.01);
    }

    // Test deposit functionality
    @Test
    public void testDeposit() {
        Account account = new Account(1, 100.0);
        account.deposit(50.0);
        Assert.assertEquals("Balance after deposit should match", 150.0, account.getBalance(), 0.01);
    }

    // Test withdrawal functionality
    @Test
    public void testWithdraw() {
        Account account = new Account(1, 100.0);
        account.withdraw(30.0);
        Assert.assertEquals("Balance after withdrawal should match", 70.0, account.getBalance(), 0.01);
    }
}
