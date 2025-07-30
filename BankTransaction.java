//Multithreading – Bank Transaction Simulation


class BankAccount {
    private int balance = 10000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing ₹" + amount);
            balance -= amount;
            System.out.println("Balance after withdrawal: ₹" + balance);
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable r = () -> account.withdraw(7000);

        Thread t1 = new Thread(r, "User1");
        Thread t2 = new Thread(r, "User2");

        t1.start();
        t2.start();
    }
}
