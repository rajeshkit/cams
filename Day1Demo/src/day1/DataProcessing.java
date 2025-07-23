package day1;

public class DataProcessing {
    int data=3455;
    String name="TCS";
    public void display(){
        Printers.print(data); //primitive value 3455
        Loan loan=new Loan();
        Printers.print(loan); // Non primitive 30303030
    }
}
