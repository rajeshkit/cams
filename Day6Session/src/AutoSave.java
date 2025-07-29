public class AutoSave implements Runnable{
    @Override
    public void run() {
        System.out.println("Auto save task executed by thread: "+
                Thread.currentThread().getName());
    }
}
