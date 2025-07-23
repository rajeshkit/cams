public class UpiPayment extends OnlineBanking{
//    public void makePayment(String internetBanking){
//        System.out.println("online banking");
//    }
    public void makePayment(String internetBanking){
        System.out.println("online banking");
    }

    public static void main(String[] args) {
        OnlineBanking onlineBanking=new OnlineBanking();
        onlineBanking.makePayment("fhf"); // runtime
        UpiPayment upiPayment=new UpiPayment();
        upiPayment.makePayment("");
        OnlineBanking onlineBanking1=new UpiPayment();
        onlineBanking1.makePayment("");
        String str=new String();


    }
}
