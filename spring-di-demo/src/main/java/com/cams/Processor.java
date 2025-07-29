package com.cams;

public class Processor {
   int processorId=7;
   String processorName="i7";

    public Processor() {
        System.out.println("processor class no arg constructor");
    }
    public void processorDetails(){
        System.out.println(processorId+" "+processorName);
    }
}
