concurrency simply refers to the ability of a system to perform more than one job simultaneously.

Concurrency in Java programs is achieved through a process called threading, 
in which threads of execution are also referred to as lightweight processes.

Thread objects exist within, and share the resources of, the main process. 
Every Java application has at least one thread, the main thread. 

The code within the main() method executes as a thread within the application process and may create additional threads. 
These additional threads, along with the main thread, coexist within the same process and try to run concurrently.

Concurrency is often an illusion; a single processing unit can only do one thing at a time,
but the advanced speed and sophistication of modern processors can easily make it appear as if they are truly working on multiple processes at the same time.


Thread Class

The Thread class provides support for creating and manipulating thread objects, which may be realized in two ways:
Extending the Thread class
Implementing the Runnable interface

The following constructors are used for creating the threads in this lecture:
Thread() — Allocates a new Thread object.
Thread(String name) — Allocates a new Thread object with the specified name.
Thread(Runnable target) — Allocates a new Thread object using a Runnable implementing object.

The following methods are the most commonly used when dealing with thread objects:
void start() — Causes the thread to begin execution. The JVM invokes the run() method of this thread. At this point, two threads are running concurrently: the one that returns from the call to the start() method, and the thread that executes its run() method.
void run() — When specified in a thread class, this method will be automatically invoked when start() is called.
String getName() — Returns the name of the thread.
int getPriority() — Returns the priority of this thread, a number that ranges from 1 to 10. The default priority is 5.
void setPriority(int newPriority) — Changes the priority of the thread.
static void sleep(long milliseconds) — Causes the current thread to pause for the specified duration.
static void yield() — Causes the current thread to temporarily pause and allow other threads to execute.
void interrupt() — Interrupts the thread.
void join() — Waits for the thread to complete.
void join(long milliseconds) — Waits for the thread to complete for a time not exceeding the specified duration.


//Example
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

//Output
Hello 1 from Thread2
Hello 1 from Thread1
Hello 2 from Thread1
Hello 3 from Thread1
Hello 2 from Thread2
Hello 3 from Thread2
Hello 4 from Thread2
Hello 5 from Thread2
Hello 4 from Thread1
Hello 5 from Thread1


//Yield()
// Yield to the other thread; executed when the thread is started
public void run() {
    for (int i = 1; i <= 5; i++) {
        System.out.printf("Hello %d from %s\n", i, this.getName());
        Thread.yield();
    }
}


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


//Sleep
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
