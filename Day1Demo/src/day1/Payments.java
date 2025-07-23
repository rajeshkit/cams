package day1;

public final class Payments {
    final int AMOUNT=345;
   public  void payment(){ //overridden
        System.out.println("upi");
    }
    public void statement(){
        System.out.println("statement in email");
    }
}
class MakePayment extends Payments{
    @Override
   public void payment(){//overriding
        System.out.println("internet Banking");
    }

    @Override
    public void statement() {
        System.out.println("statement on sms");
    }
}
