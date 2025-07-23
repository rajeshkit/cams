import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Bank b=new Bank();// it calls Bank()
//       Integer k=34;
//        System.out.println(k.toString());
        Player p1=new Player();
        p1.setPlayerId(3456);
        p1.setPlayerName("Sachin");
                    //3546                  Sachin
        Loan.display(p1.getPlayerId(), p1.getPlayerName());
        Loan.display(p1);//50505050
//        Player p2=new Player();
//        p2.setPlayerId(3456);
//        p2.setPlayerName("Sachin");
//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());
//        System.out.println(p1.equals(p2));
    }
}