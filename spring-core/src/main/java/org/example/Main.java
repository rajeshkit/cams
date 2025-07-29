package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
        Trainer t = ac.getBean(Trainer.class);
        t.displayTrainer();
    }
}
