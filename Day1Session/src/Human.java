public class Human {
    Heart h;
                        //20202020
    public Human(Heart heart){
        h=heart;
    }
    public void isAlive(){
        System.out.println(h.hesrtBeat());
    }

    public static void main(String[] args) {
        Heart h1=new Heart();
                            //20202020
        Human human=new Human(h1);
        human.isAlive();
        human=null;
    }
}
