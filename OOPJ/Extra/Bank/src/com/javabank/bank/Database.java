/*
 * File Operation Reference from :-
 * https://stackoverflow.com/questions/16111496/java-how-can-i-write-my-arraylist-to-a-file-and-read-load-that-file-to-the#:~:text=6-,Answers
 * 
 */

package com.javabank.bank;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Database {
    /* ArrayList for all the user and accounts */
    private static ArrayList<User> users = new ArrayList<>();
    private static ArrayList<Account> accounts = new ArrayList<>();

    /* Database Constructor in which we are reading the data from files(accounts.ser & users.ser) */
    public Database() {
        try {
            /* Reading data from users.ser file */
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("users.ser"));
            users = ((ArrayList<User>) in.readObject());
            in.close();
            /* Reading data from accounts.ser file */
            in = new ObjectInputStream(new FileInputStream("accounts.ser"));
            accounts = ((ArrayList<Account>) in.readObject());
            in.close();
        } catch (Exception e) {
        }
    }

    /* checking for username already taken or not */
    public Boolean usernameAvailable(String s) {
        for (User u : users) {
            if (u.checkUsername(s))
                return false;
        }
        return true;
    }

    /* 
     * update new account details to accounts ArrayList
     * and write it to files...
     */
    protected void updateAccount(Account acc) throws DatabaseError {
        int acc_no = acc.getAccountNumber();

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).checkAccountNo(acc_no)) {
                accounts.set(i, acc);
            }
        }

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("accounts.ser"));
            out.writeObject(accounts);
            out.close();
        } catch (Exception e) {
            throw new DatabaseError("Failed to update Account");
        }
    }

    public Account getAccount(int accNo) {
        for (Account acc : accounts) {
            if (acc.checkAccountNo(accNo)) {
                return acc;
            }
        }
        return null;
    }

    public User loginValidate(String username, String password) {
        for (User user : users) {
            if (user.validate(username, password)) {
                return user;
            }
        }
        return null;
    }

    public void addData(User user, Account acc) throws DatabaseError {
        users.add(user);
        if (acc != null)
            accounts.add(acc);
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("users.ser"));
            out.writeObject(users);
            out.close();
            if (acc == null)
                return;
            out = new ObjectOutputStream(new FileOutputStream("accounts.ser"));
            out.writeObject(accounts);
            out.close();
        } catch (Exception e) {
            throw new DatabaseError("Failed to update Account ");
        }
    }
}
