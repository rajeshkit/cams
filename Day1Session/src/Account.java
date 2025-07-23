import java.util.concurrent.RunnableScheduledFuture;

public class Account  {
    int accountNumber;
    String accountType;
    int balance;
    public void statement(){
        System.out.println(accountNumber);
        System.out.println(accountType);
        System.out.println(balance);
    }
    public void displayLoans(){ // instance method
        //loanDetails();
        //System.out.println(branchName);
        System.out.println(Loan.bankName);
        Loan.display();
    }

    public static void main(String[] args) {

    }
}
