package com.sbi.account;

public class SavingAccount   {
    public int savingAccountNo=3456;
    void savingStatement(){
        System.out.println("saving account statement");
        CurrentAccount currentAccount=new CurrentAccount();
        System.out.println(currentAccount.currentAccountNo);
        currentAccount.currentStatement();
    }

}
