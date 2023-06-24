package com.javabank.bank;

public class DatabaseError extends Exception {
    public DatabaseError(String str) {
        super("DATABASE Error: " + str);
    }
}
