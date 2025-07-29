package com.cams;

public class Mobile {
    Processor process;
    String model="Samsung";
    int cost=30000;

    public void setProcess(Processor process) {
        this.process = process;
    }

    public void mobileDetails(){
        System.out.println(model+" "+cost);
        process.processorDetails();
        //processor

    }
}
