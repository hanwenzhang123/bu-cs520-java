package cs520.module6.L1_threads;

public class P04_HelloRunnable implements Runnable {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Hello %d from %s\n", i, Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		Runnable app = new P04_HelloRunnable();
		Thread t1 = new Thread(app);
		t1.start();
		Thread t2 = new Thread(app);
		t2.start();
		System.out.println("Finishing the main...");
	}
}
