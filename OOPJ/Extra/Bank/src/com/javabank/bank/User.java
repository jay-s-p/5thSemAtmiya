package com.javabank.bank;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class User implements Serializable {

    private String name;
    private String username;
    private String password;
    private ArrayList<Integer> userAccounts = new ArrayList<>();
    private static final Database db = new Database();

    public User(String name, String username, String password) throws DatabaseError {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public Account createAccount(long amount, String type) throws DatabaseError, IllegalArgumentException {
        // TODO accNo validation
        int accNo = Math.abs(new Random().nextInt());
        Account acc = new Account(amount, type, accNo);
        userAccounts.add(accNo);
        db.addData(this, acc);
        return acc;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getAccounts() {
        return this.userAccounts;
    }

    public int getAccountCount() {
        return userAccounts.size();
    }

    protected Boolean checkUsername(String s) {
        return this.username.equals(s);
    }

    protected boolean validate(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password))
            return true;
        return false;
    }
}
