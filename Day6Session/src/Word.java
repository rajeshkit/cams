public class Word {
    public static void main(String[] args) {
        Runnable r1=new Typing();
        Thread t1=new Thread(r1);
        r1=new SpellChecking();
        Thread t2=new Thread(r1);
        r1=new AutoSave();
        Thread t3=new Thread(r1);
        t1.start();
        t2.start();
        t3.start();

    }
}
