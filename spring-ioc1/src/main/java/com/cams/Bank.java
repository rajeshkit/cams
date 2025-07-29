package com.cams;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bank {
    public static void main(String[] args) {
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("myappbeanconfig.xml");
        Loan l=ac.getBean(Loan.class);
        l.loanDetails();

        Account account=ac.getBean(Account.class);
        account.accountDetails();

        Payment payment=ac.getBean(Payment.class);
        payment.paymentDetails();

        System.out.println(ac.getBeanDefinitionCount());
        for (String s:ac.getBeanDefinitionNames()){
            System.out.println(s.toString());
        }

    }
}
