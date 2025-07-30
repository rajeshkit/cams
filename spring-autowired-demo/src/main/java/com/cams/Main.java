package com.cams;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=
                new AnnotationConfigApplicationContext(AppBeanConfig.class);
        for(String n:ac.getBeanDefinitionNames()){
            System.out.println(n);
        }
    }

}