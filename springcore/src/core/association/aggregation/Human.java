package core.association.aggregation;

public class Human {
    Heart t;
                //20202020
   public Human(Heart t) {
      // t=new Heart();//strong association
       this.t=t;
    }

    public static void main(String[] args) {
     //   Heart heart=new Heart();//20202020
                         //20202020
        Human h=new Human(new Heart());

        h=null;
    }
}
