public class CreditCard {
    int cardNo;
    String cardName;
    float roi;
   public CreditCard(){
        System.out.println("constructor is called");
    }               //1234,     "Visa",        3.5f
    public CreditCard(int cno,String ctype,float in){
        cardName=ctype;
        cardNo=cno;
        roi=in;
    }
    static{
        System.out.println("static bloc is executed");
    }
    public void statement(){
        System.out.println("satement");
        System.out.println(cardName);
        System.out.println(cardNo);
        System.out.println(roi);
    }
    public static void payBill(){
        System.out.println("pabill method");
    }
    public static void main(String[] args) {
        CreditCard.payBill();
        CreditCard creditCard=new CreditCard(1234,"Visa",3.5f);
        creditCard.statement();
        CreditCard c1=new CreditCard(5677,"Master",2.5f);
        c1.statement();
        CreditCard c2=new CreditCard(7889,"American",5.5f);
        c2.statement();
        CreditCard c3=new CreditCard();
        c2.statement();
    }
}
