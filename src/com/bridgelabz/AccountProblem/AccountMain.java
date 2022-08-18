package com.bridgelabz.AccountProblem;

public class AccountMain {
    public static void main(String args[]) {
        Account saraswat = new Account("Surya Vishwakarma",396203100001915L,45000);
        Account baroda = new Account("Naveen Vasava",396203100000147L,250000);
        Account gramin = new Account("Rajeev Singh",7241966584217L,1400);
        AccountBase accountBase = new AccountBase();
        accountBase.addAccount(saraswat);
        accountBase.addAccount(baroda);
        accountBase.addAccount(gramin);

        accountBase.checkBalance(saraswat, 396203100001915L);
        accountBase.checkBalance(baroda, 396203100000147L);
        accountBase.checkBalance(gramin, 7603985858L);

        accountBase.withdrawalAmount(saraswat,396203100001915L,10000);
        accountBase.checkBalance(saraswat, 396203100001915L);
        accountBase.withdrawalAmount(saraswat,396203100001915L,100000);
        accountBase.checkBalance(saraswat, 396203100001915L);
        accountBase.withdrawalAmount(baroda, 396200000147L,100000);


    }
}
