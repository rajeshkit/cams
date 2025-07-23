package threadsdemo;

public class Demo1 implements Runnable{
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        Thread t1=new Thread(d1);
        t1.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello task1 by: "+Thread.currentThread().getName()+": "+i);
        }

    }
}
