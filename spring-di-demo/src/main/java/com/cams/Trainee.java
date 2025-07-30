package com.cams;

public class Trainee {
    Assessment assessment; //Autowire by name

    public Trainee(Assessment assessment) { //Autowire by constructor
        this.assessment = assessment;
        assessment.dislayAssessment();
    }
    public void setAssessment(Assessment assessment) {//Autowire by Type or byName
        this.assessment = assessment;
    }
}
