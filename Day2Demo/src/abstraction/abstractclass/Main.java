package abstraction.abstractclass;

public class Main {
    public static void main(String[] args) {
            PassportHeadOffice office=new ChennaiPassportOffice();
            office.applyPassort();
            office.verification();
            office.interview();
    }
}
