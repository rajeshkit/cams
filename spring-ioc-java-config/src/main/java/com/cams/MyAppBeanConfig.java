package com.cams;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppBeanConfig {

    @Bean
    public Payment payment(){
        return new Payment();
    }
    @Bean
    public Account account(){
        return new Account(payment());
    }
    @Bean
    public Loan loan(){
        Loan loan = new Loan();
        loan.setPayment(payment());
        return loan;
    }
}
