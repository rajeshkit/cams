package com.sbi.abstraction;

public class ChennaiPassportOffice extends HeadOffice{

    @Override
    public void appoinment() {
        System.out.println("online appointement");
    }

    @Override
    public void verfication() {
        System.out.println("Aadhar card");
    }
}
