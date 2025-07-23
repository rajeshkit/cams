package com.sbi.abstraction;

public class ChennaiOffice implements HeadOffice1{
    @Override
    public void applyPassport() {
        System.out.println("passport seva .com");
    }

    @Override
    public void appoinment() {
        System.out.println("online appoinment");
    }

    @Override
    public void verification() {
        System.out.println("Aadhar card");
    }
}
