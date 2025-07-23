package com.sbi.card;

import com.sbi.account.CurrentAccount;

public class CreditCard extends CurrentAccount{
    public void show(){

        System.out.println(currentAccountNo);
        currentStatement();
    }
}
