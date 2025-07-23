package day1;

import java.util.Scanner;

public final class Customer {

    public void myLoans(){
        //get the loan details
        Loan loan=new Loan();//HAS-A
        long amount=loan.loanDetails();
        long total=amount*1000;


    }

    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.myLoans();

    }
}
