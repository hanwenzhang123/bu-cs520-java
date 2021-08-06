package cs520.module6.L1_threads;

public class P08_Consumer extends Thread {
	private P06_Account account;

	public P08_Consumer(P06_Account a) {
		super("ConsumerThread");
		this.account = a;
	}

	// Make 5 withdrawals from the account
	public void run() {
		for (int i = 1; i <= 5; i++) {
			int amount = 500 + (int) (1000 * Math.random());
			account.withdraw(amount, i);
			try {
				Thread.sleep((long) (1000 * Math.random()));
			} catch (InterruptedException e) {
			}
		}
	}
}
