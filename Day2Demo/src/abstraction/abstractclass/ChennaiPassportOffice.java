package abstraction.abstractclass;

public class ChennaiPassportOffice extends PassportHeadOffice{

    @Override
    public void verification() {
        System.out.println("Aadhar card for the verification");
    }

    @Override
    public void interview() {
        System.out.println("through zoom or teams going to connect");
    }
}
