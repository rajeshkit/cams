package com.cams;

public class Trainee {
    Assessment assessment;

    public Trainee(Assessment assessment) {
        this.assessment = assessment;
        assessment.dislayAssessment();
    }


}
