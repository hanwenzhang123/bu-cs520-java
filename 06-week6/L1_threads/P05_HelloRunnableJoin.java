package cs520.module6.L1_threads;

public class P05_HelloRunnableJoin implements Runnable {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Hello %d from %s\n", i, Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		Runnable app = new P05_HelloRunnableJoin();
		Thread t1 = new Thread(app);
		t1.start();
		Thread t2 = new Thread(app);
		t2.start();
		// wait now until the threads complete
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// the two threads are done at this point
		System.out.println("Finishing the main...");
	}
}
