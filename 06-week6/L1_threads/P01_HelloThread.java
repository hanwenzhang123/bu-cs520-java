package cs520.module6.L1_threads;

public class P01_HelloThread extends Thread {

	public P01_HelloThread() {
	}

	public P01_HelloThread(String name) {
		super(name);
	}

	// Executed when the thread is started
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Hello %d from %s\n", i, this.getName());
		}
	}

	// Create and start the threads
	public static void main(String[] args) {
		Thread t1 = new P01_HelloThread("Thread1");
		Thread t2 = new P01_HelloThread("Thread2");
		t1.start();
		t2.start();
	}
}
