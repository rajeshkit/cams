package org.example;

public class Trainee {
    int traineeId;
    String traineeName;

    public Trainee(int traineeId, String traineeName) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
    }
    public void displayTrainee(){
        System.out.println(traineeId+" "+traineeName);
    }
}
