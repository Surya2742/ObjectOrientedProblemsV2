package com.bridgelabz.AccountProblem;

import java.util.ArrayList;
import java.util.List;

public class AccountBase {
    private List<Account> accountList = new ArrayList<>();

    public void addAccount(Account bankName) {
        accountList.add(bankName);
    }

    public boolean accountExistCheck(long number) {
        boolean check = false;
        for(Account account: accountList) {
            if(number == account.accountNumber) {
                check = true;
            }
        }
        return check;
    }

    public void checkBalance(Account bankName, long number) {
        if(number == bankName.accountNumber) {
            System.out.println("Welcome " + bankName.accountHolderName);
            System.out.println("Your Account balance is " + bankName.accountBalance + "\n");
        }
        else
            System.out.println("Invalid account number\n");
    }

    public void withdrawalAmount(Account bankName, long number, long amount) {
        if(accountExistCheck(number)) {
            if(amount <= bankName.accountBalance) {
                System.out.println("Mr. " + bankName.accountHolderName + ": Rs. " + amount + " Debited from your account ");
                bankName.accountBalance -= amount;
                System.out.println("Your Current Account Balance is " + bankName.accountBalance + "\n");
            }
            else
                System.out.println("Insufficient Balance to withdraw Rs. " + amount + "\n");
        }
        else
            System.out.println("Account Number doesn't exist\n");
    }
}
