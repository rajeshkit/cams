public class Trainer implements Runnable {
    public static void main(String[] args) {
        Runnable r=new Trainer();
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        System.out.println("task to be executed by thread");
    }
}
