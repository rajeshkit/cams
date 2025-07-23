package com.sbi.loan;

public class JewelLoan extends PersonalLoan{
    @Override
    public void display1() {
        System.out.println("child class display1");
    }

    @Override
    public void display2() {
        System.out.println("child class display2");
    }
}
