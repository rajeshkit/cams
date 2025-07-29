package com.cams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Account {
    Payment payment;
    int accountId=2434344;
    String accountName="Saving Account";

    public Account(Payment payment) {
        this.payment = payment;
    }

    public void accountDetails(){
        System.out.println("Account Id:"+accountId);
        System.out.println("Account Name"+accountName);
        payment.paymentDetails();
    }
}
