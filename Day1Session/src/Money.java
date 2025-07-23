public class Money {
    int amount;
    public void savings(){
        System.out.println(amount);
    }

    public static void main(String[] args) {
        Money m=new Money();// 20202020
        System.out.println(m);
        Money m1=m;//20202020
        Money m2=new Money();// 30303030
         m1=m2;
         m1=null;
    }
}
