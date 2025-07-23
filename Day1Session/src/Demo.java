import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;

public class Demo extends Date {

    public void show(){
        Loan.display();
        Loan.bankName="";
        Loan loan=new Loan();
        loan.loanDetails();
        System.out.println(loan.loanAmount);
        System.out.println(loan.loanType);
        System.out.println(loan.loanAmount);


    }
}
