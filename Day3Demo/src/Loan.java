public class Loan {
    Loan(){
        System.out.println("Loan no arg constructor");
    }
    public static void task(Player pp){
        System.out.println(pp.getPlayerId());
        System.out.println(pp.getPlayerName());
    }
    public static void display(int playerId,String playerName){// logic is to print the player info
        System.out.println(playerName);
        System.out.println(playerId);
    }                           //50505050
    public static void display(Player p){// logic is to print the player info
        System.out.println(p.getPlayerName());
        System.out.println(p.getPlayerId());
        Loan.task(p);
    }
}
