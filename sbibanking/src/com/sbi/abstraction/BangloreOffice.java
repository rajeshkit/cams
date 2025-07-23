package com.sbi.abstraction;

public class BangloreOffice implements HeadOffice1{
    @Override
    public void applyPassport() {
        System.out.println("come to office in banglore");
    }

    @Override
    public void appoinment() {
        System.out.println("Inperson visit");
    }

    @Override
    public void verification() {
        System.out.println("PAN card");

    }
}
