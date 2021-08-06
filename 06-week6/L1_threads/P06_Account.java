package cs520.module6.L1_threads;

public class P06_Account {

	private int balance = 0;

	// increment the balance and notify a waiting thread
	public synchronized void deposit(int amount, int step) {
		balance += amount;
		System.out.printf("%s (#%d) deposited %d, New Balance %d\n", Thread.currentThread().getName(), step, amount,
				balance);
		notify();
	}

	// wait if the amount is less than the balance
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
		// balance can now be decremented
		balance -= amount;
		System.out.printf("%s (#%d) withdrew %d, New balance %d\n", Thread.currentThread().getName(), step, amount,
				balance);
	}
}
