package com.cams;

import org.springframework.beans.factory.annotation.Autowired;

public class Loan {
    Payment payment;
    int loanId=456;
    String loanName="Personal com.cams.Loan";

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void loanDetails(){
        System.out.println("com.cams.Loan Id:"+loanId);
        System.out.println("com.cams.Loan Name"+loanName);
    }
}
