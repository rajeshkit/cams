package day1;

public class Player {
    int playerId;
    String playerName;
    public void racquetDetails(){
        Racquet rr=new Racquet();
        rr.info();
        Racquet.swing();
    }
}
