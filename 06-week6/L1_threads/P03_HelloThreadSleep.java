package cs520.module6.L1_threads;

public class P03_HelloThreadSleep extends Thread {

	public P03_HelloThreadSleep(String name) {
		super(name);
	}

	// Executed when the thread is started
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Hello %d from %s\n", i, this.getName());
			// Generate a random value between 0 and 10 seconds
			long milliseconds = (long)(10000 * Math.random());
			try {
				Thread.sleep(milliseconds);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new P03_HelloThreadSleep("Thread1");
		Thread t2 = new P03_HelloThreadSleep("Thread2");
		t1.start();
		t2.start();
	}
}
