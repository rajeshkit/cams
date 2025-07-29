package core.association.composition;

public class Human {
    Heart t;
   public Human() {
      t=new Heart();//strong association
    }

    public static void main(String[] args) {
        Human h=new Human();

        h=null;
    }
}
