package com.cams;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
public class Investment {
    int investmentId;
    long investmentAmount;
    public void displayInvestment(){
        System.out.println("Investment ID: "+investmentId);
        System.out.println("Invested Amount: "+investmentAmount);
    }
}
