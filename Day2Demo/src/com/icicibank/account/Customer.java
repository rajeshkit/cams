package com.icicibank.account;

public class Customer implements  Comparable{
    public void display(){
        Account account=new Account();
        System.out.println(account.accountNumber);
        account.generateStatement();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
