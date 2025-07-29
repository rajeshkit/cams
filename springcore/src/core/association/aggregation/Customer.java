package core.association.aggregation;

public class Customer {
    //customer class is depend on Loan class
    private Loan loan;

    public void setLoan(Loan loan) {
        this.loan = loan;
    }
    //    public Customer(Loan loan) {
//        this.loan = loan;
//    }

    public static void main(String[] args) {
        Loan l=new Loan();
        Customer c=new Customer();
        c.setLoan(l);
    }
}
