class BankAccount {
    private int balance = 1000;
    public synchronized void withdraw(int amount) {
        System.out.println("line1");
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " attempted withdrawal. Insufficient funds!");
            }
        }
        System.out.println("line2");
    }
}

class CustomerThread extends Thread {
    BankAccount account;

    CustomerThread(BankAccount account, String name) {
        super(name);
        this.account = account;
    }

    public void run() {
        account.withdraw(700);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount();
        CustomerThread t1 = new CustomerThread(sharedAccount, "Customer-1");
        CustomerThread t2 = new CustomerThread(sharedAccount, "Customer-2");

        t1.start();
        t2.start();
    }
}

