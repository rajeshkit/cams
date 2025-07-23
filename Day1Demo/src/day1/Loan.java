package day1;

public class Loan {
    int loanId=4546;
    String loanName="Car Loan";
    long loanAmount=34545;
    public long loanDetails(){
        System.out.println(loanId+" "+loanAmount+" "+loanName);
        return loanAmount;
    }
}
