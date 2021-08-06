package cs520.module6.L1_threads;

public class P07_Producer extends Thread {
	private P06_Account account;

	public P07_Producer(P06_Account a) {
		super("ProducerThread");
		this.account = a;
	}

	// Make 5 deposits into the account
	public void run() {
		for (int i = 1; i <= 5; i++) {
			int amount = (int) (1000 * Math.random());
			account.deposit(amount, i);
			try {
				Thread.sleep((long) (5000 * Math.random()));
			} catch (InterruptedException e) {
			}
		}
	}
}
