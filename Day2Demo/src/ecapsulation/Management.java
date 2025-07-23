package ecapsulation;

import java.sql.SQLOutput;

public class Management {
    public static void main(String[] args) {
        Player p=new Player();
        p.setAverage(-344);
        p.setTotalRuns(-2345);
        p.setPlayerName(null);
        System.out.println(p.getPlayerName());
        System.out.println(p.getJerseyNumber());
        System.out.println(p.getTotalRuns());
        System.out.println(p.getAverage());

    }
}
