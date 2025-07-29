package com.cams;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bank {
    public static void main(String[] args) {
        ApplicationContext ac=
                new AnnotationConfigApplicationContext(MyAppBeanConfig.class);
       Payment p =ac.getBean(Payment.class);
       p.paymentDetails();
        for(String s:ac.getBeanDefinitionNames()){
            System.out.println(s);
        }

    }
}
