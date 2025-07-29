package com.cams;

import org.springframework.stereotype.Component;

@Component
public class Payment {
    int paymentId=4567777;
    String paymentName="EMI";
    public void paymentDetails(){
        System.out.println("Payment Id:"+paymentId);
        System.out.println("Payment Name"+paymentName);
    }
}
