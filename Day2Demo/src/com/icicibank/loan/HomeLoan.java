package com.icicibank.loan;

import com.icicibank.account.Account;

public class HomeLoan extends Account {
    public void display(){

        System.out.println(accountNumber);
        generateStatement();
    }
}
