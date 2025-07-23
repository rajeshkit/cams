package com.sbi.abstraction;

public class User {
    public static void main(String[] args) {
       HeadOffice1 headOffice1=new ChennaiOffice();
        headOffice1.applyPassport();
        headOffice1.appoinment();
        headOffice1.verification();

       headOffice1=new BangloreOffice();
        headOffice1.applyPassport();
        headOffice1.appoinment();
        headOffice1.verification();

        headOffice1 = new String();

    }
}
