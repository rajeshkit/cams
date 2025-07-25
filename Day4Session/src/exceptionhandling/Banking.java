package exceptionhandling;

import java.util.Scanner;

public class Banking {
    public static void main(String[] args) throws InvalidAccountNumberException {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the account number");
        int accNumber=s.nextInt();
        if(accNumber<0){
            throw new InvalidAccountNumberException("account number should be positive");
        }
        System.out.println("Enter the amount");
        int amount=s.nextInt();
        if(amount<0){
            throw new InvalidAmountException();
        }
    }
}
