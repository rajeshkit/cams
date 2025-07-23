package com.sbi.abstraction;

public class BanglorePassportOffice extends HeadOffice{
    @Override
    public void appoinment() {
        System.out.println("offline appoinment");
    }

    @Override
    public void verfication() {
        System.out.println("PAN card verification");
    }
}
