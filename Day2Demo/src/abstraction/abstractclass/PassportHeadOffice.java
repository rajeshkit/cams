package abstraction.abstractclass;

public abstract class PassportHeadOffice {
    int k;
    public void applyPassort(){
        System.out.println("goto passportseva.in");
        System.out.println("document");
        System.out.println("make payment");
        System.out.println("apply");
    }
    public abstract void verification();
    public abstract void interview();
}
