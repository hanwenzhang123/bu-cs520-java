//Case Study: Producer/Consumer  
//Deposit
  package cs520.module6.L1_threads;

public class P07_Producer extends Thread {
    private P06_Account account;

    public P07_Producer(P06_Account account) {
        super("ProducerThread");
        this.account = account;
    }

    // Make 5 deposits into the account
    public void run() {
        for (int i = 1; i <= 5; i++) {
            int amount = (int) (1000 * Math.random());
            this.account.deposit(amount, i);

            try {
                Thread.sleep((long) (5000 * Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//Withdrawal
package cs520.module6.L1_threads;

public class P08_Consumer extends Thread {
    private P06_Account account;

    public P08_Consumer(P06_Account account) {
        super("ConsumerThread");
        this.account = account;
    }

    // Make 5 withdrawals from the account
    public void run() {
        for (int i = 1; i <= 5; i++) {
            int amount = 500 + (int) (1000 * Math.random());
            this.account.withdraw(amount, i);

            try {
                Thread.sleep((long) (1000 * Math.random()));
            } catch (InterruptedException e) {
            }
        }
    }
}

package cs520.module6.L1_threads;

public class P09_Test {

    public static void main(String[] args) {
        // Create an account object and share it with the two threads
        P06_Account jointAccount = new P06_Account();
        P07_Producer producer = new P07_Producer(jointAccount);
        P08_Consumer consumer = new P08_Consumer(jointAccount);
        producer.start();
        consumer.start();
    }
}

// ProducerThread (#1) deposited 706, New Balance 706
// ConsumerThread (#1) waiting to withdraw 842 (Current balance 706)
// ProducerThread (#2) deposited 316, New Balance 1022
// ConsumerThread (#1) withdrew 842, New balance 180
// ConsumerThread (#2) waiting to withdraw 1249 (Current balance 180)
// ProducerThread (#3) deposited 925, New Balance 1105
// ConsumerThread (#2) waiting to withdraw 1249 (Current balance 1105)
// ProducerThread (#4) deposited 170, New Balance 1275
// ConsumerThread (#2) withdrew 1249, New balance 26
// ConsumerThread (#3) waiting to withdraw 984 (Current balance 26)
// ProducerThread (#5) deposited 226, New Balance 252
// ConsumerThread (#3) waiting to withdraw 984 (Current balance 252)

  package cs520.module6.L1_threads;

public class P06_Account {

    private int balance = 0;

    // Increment the balance and notify a waiting thread
    public synchronized void deposit(int amount, int step) {
        this.balance += amount;
        System.out.printf("%s (#%d) deposited %d, New Balance %d\n",
            Thread.currentThread().getName(), step, amount, this.balance);
        notify();
    }

    // Wait if the amount is less than the balance
    public synchronized void withdraw(int amount, int step) {
        while (amount > balance) {
            System.out.printf("%s (#%d) waiting to withdraw %d (Current balance %d)\n",
                Thread.currentThread().getName(), step, amount, balance);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Balance can now be decremented
        this.balance -= amount;
        System.out.printf("%s (#%d) withdrew %d, New balance %d\n",
            Thread.currentThread().getName(), step, amount, this.balance);
    }
}
