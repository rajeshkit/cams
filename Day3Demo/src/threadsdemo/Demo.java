package threadsdemo;

public class Demo extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello task1 by: "+Thread.currentThread().getName()+": "+i);
        }

    }

    public static void main(String[] args) {
        System.out.println("line 1");
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getState());
        System.out.println("line 2");
        Demo d1=new Demo();
        d1.setName("t1");
        d1.start();// internally it is going to call the run() method
        Demo d2=new Demo();
        d2.setName("t2");
        d2.start();// internally it is going to call the run() method
    }
}
