public class ThreadsDemo extends Thread{
    @Override
    public void run(){ //task
        System.out.println("The task of the thread: "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadsDemo t1=new ThreadsDemo();
        ThreadsDemo t2=new ThreadsDemo();
        ThreadsDemo t3=new ThreadsDemo();
        t1.start();
        t2.start();
        t3.start();
    }
}
