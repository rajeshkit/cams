package com.cams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MutualFund {
   Investment investment;
    @Autowired

    public MutualFund(@Qualifier("investment1") Investment investment) {
        this.investment = investment;
        investment.displayInvestment();
    }


}
