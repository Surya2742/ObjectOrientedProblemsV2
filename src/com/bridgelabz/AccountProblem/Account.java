package com.bridgelabz.AccountProblem;

public class Account {
    public long accountBalance;
    public String accountHolderName;
    public long accountNumber;
    public Account(String accountHolderName, long accountNumber, long accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
}
