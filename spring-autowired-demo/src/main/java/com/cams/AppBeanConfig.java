package com.cams;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.cams")
public class AppBeanConfig {
    @Bean
    public Investment investment(){
        return new Investment();
    }
    @Bean
    public Investment investment1(){
        return new Investment();
    }

//    @Bean
//    public MutualFund mutualFund(){
//        return new MutualFund(investment()); // constructor based injection
//    }
//    @Bean
//    public MutualFund mutualFund1(){
//        MutualFund mf=new MutualFund();
//        mf.setInvestment(investment());// setter based injection
//        return mf;
//    }
}
