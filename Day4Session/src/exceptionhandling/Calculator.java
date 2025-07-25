package exceptionhandling;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int[] a=new int[5];
        System.out.println("Line1");
        System.out.println("Line2");
        System.out.println("Line3");
        System.out.println("Line4");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the index");
        try {
            a[9]=345; //throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }finally {
            System.out.println("");
        }
        System.out.println("Enter the denominator");
        int total=10/s.nextInt();
        System.out.println("try is executed");
        System.out.println("Line5");
        System.out.println("Line6");
        System.out.println("Line7");
        System.out.println("Line8");
    }


}
