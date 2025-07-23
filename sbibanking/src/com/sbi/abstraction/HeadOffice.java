package com.sbi.abstraction;

public abstract class HeadOffice {
    int k=10;
    public void applyPassport(){
        System.out.println("goto passpoert seva website");
        System.out.println("sign up");
        System.out.println("fill the details");
        System.out.println("upload the documents");
        System.out.println("appoinment");
    }
    protected abstract void appoinment();
    abstract void verfication ();
}
