package com.javabank.bank;

import java.io.Serializable;

public class Account extends Branch implements Serializable {
    private int accountNumber;
    private long balance;
    private String accountType;
    private static final Database db = new Database();
    public final static int MIN_BALANCE = 3000;

    public Account(long balance, String type, int accNo) throws DatabaseError, IllegalArgumentException {
        if (balance < MIN_BALANCE)
            throw new IllegalArgumentException("Money must be grater than 3000.");
        this.balance = balance;
        this.accountType = type;
        this.accountNumber = accNo;
    }

    public void debitBalance(long x) throws DatabaseError, IllegalArgumentException {
        if ((Long.MAX_VALUE - this.balance) < x)
            throw new IllegalArgumentException("Max value reached.");
        if ((this.balance + x) <= this.balance)
            throw new IllegalArgumentException("Invalid value");
        this.balance += x;
        db.updateAccount(this);
    }

    public void creditBalance(long x) throws DatabaseError, IllegalArgumentException {
        if ((this.balance - x) >= this.balance)
            throw new IllegalArgumentException("Invalid value");
        if ((this.balance - x) <= MIN_BALANCE)
            throw new IllegalArgumentException("Minimal balance must be grater than 3000.");
        this.balance -= x;
        db.updateAccount(this);
    }

    public long getBalance() {
        return this.balance;
    }

    protected String getAccountType() {
        return this.accountType;
    }

    protected int getAccountNumber() {
        return this.accountNumber;
    }

    protected Boolean checkAccountNo(int accNo) {
        return (accountNumber == accNo);
    }

}