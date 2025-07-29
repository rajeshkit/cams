public class Typing implements Runnable{
    @Override
    public void run() {
        System.out.println("Typing task executed by thread: "+
                Thread.currentThread().getName());
    }
}
