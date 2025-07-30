package com.cams;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("myappconfig.xml");
      //  Trainee t=ac.getBean(Trainee.class);
        Assessment a1=ac.getBean(Assessment.class);
        System.out.println(a1.hashCode());
        Assessment a2=ac.getBean(Assessment.class);
        System.out.println(a2.hashCode());
        Assessment a3=ac.getBean(Assessment.class);
        System.out.println(a3.hashCode());
    }
}
