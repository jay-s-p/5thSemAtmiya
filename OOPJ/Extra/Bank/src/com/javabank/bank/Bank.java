package com.javabank.bank;

class Bank {
    private String bankName;
    private int bankCode;

    protected Bank() {
    }

    protected Bank(String bankName, int bankCode) {
        this.bankName = bankName;
        this.bankCode = bankCode;
    }

    protected String getBankName() {
        return this.bankName;
    }

    protected int getBankCode() {
        return this.bankCode;
    }
}
