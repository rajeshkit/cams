public class SpellChecking implements Runnable{
    @Override
    public void run() {
        System.out.println("Spelling check task executed by thread: "+
                Thread.currentThread().getName());
    }
}
