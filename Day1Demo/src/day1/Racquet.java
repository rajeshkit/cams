package day1;

public class Racquet {
    int id;
    String name;
    int cost;
    static String brandName="Yonex";

    public Racquet(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    Racquet(){
        id=100;
        name="100zz";
        cost=2000;

    }

    void play(){


    }
    static void swing(){

    }

    public void info() {
        Racquet r=new Racquet(100,"100zz",20000);//40404040
        System.out.println(r.id);
        System.out.println(r.name);
        System.out.println(r.cost);
        System.out.println(Racquet.brandName);
//        Racquet r1=new Racquet(200,"abc",10000);//40404040
//        System.out.println(r1.id);
//        System.out.println(r1.name);
//        System.out.println(r1.cost);
//        System.out.println(Racquet.brandName);
    }
}
