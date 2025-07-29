package org.example;

import org.springframework.stereotype.Component;

@Component
public class Trainer {
    int trainerId;
    String trainerName;
    public Trainer(){

    }
    public Trainer(int trainerId, String trainerName) {
        this.trainerId = trainerId;
        this.trainerName = trainerName;
    }
    public void displayTrainer(){
        System.out.println(trainerId+" "+trainerName);
    }
}
