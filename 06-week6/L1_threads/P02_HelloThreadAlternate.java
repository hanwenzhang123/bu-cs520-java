package cs520.module6.L1_threads;

public class P02_HelloThreadAlternate extends Thread {

	public P02_HelloThreadAlternate(String name) {
		super(name);
	}

	// Yield to the other thread; executed when the thread is started
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Hello %d from %s\n", i, this.getName());
			Thread.yield();
		}
	}

	public static void main(String[] args) {
		Thread t1 = new P02_HelloThreadAlternate("Thread1");
		Thread t2 = new P02_HelloThreadAlternate("Thread2");
		t1.start();
		t2.start();
	}
}
