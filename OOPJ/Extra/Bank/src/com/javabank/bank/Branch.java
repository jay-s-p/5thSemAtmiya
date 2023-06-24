package com.javabank.bank;

class Branch extends Bank {
    private String branchName;
    private int branchCode;
    private String branchAddress;

    protected Branch() {
    }

    protected Branch(String branchName, int branchCode, String branchAddress) {
        this.branchName = branchName;
        this.branchCode = branchCode;
        this.branchAddress = branchAddress;
    }

    protected String getBranchName() {
        return this.branchName;
    }

    protected int getBranchCode() {
        return this.branchCode;
    }

    protected String getBranchAddress() {
        return this.branchAddress;
    }

}