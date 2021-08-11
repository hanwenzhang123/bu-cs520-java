An alternate approach is to create threads by implementing the Runnable interface. 
This is particularly useful when a class already extends another class and therefore cannot extend the Thread class. 
The interface thus allows the inheritance hierarchy to remain unchanged while still delivering threading capability.

The following example shows the Thread constructor taking an object that implements Runnable as its argument.
The thread objects are then executed by invoking the start() methods. 
The run() method on the Runnable-implementing object is automatically executed as a result.

//Example
package cs520.module6.L1_threads;

public class P04_HelloRunnable implements Runnable  {

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
        System.out.println("Finishing main()");
    }
}

//Output
Finishing main()
Hello 1 from Thread-1
Hello 2 from Thread-1
Hello 3 from Thread-1
Hello 4 from Thread-1
Hello 5 from Thread-1
Hello 1 from Thread-0
Hello 2 from Thread-0
Hello 3 from Thread-0
Hello 4 from Thread-0
Hello 5 from Thread-0


 If the main() method has to wait for the threads to complete their execution before it proceeds, the join() method may be invoked on those thread objects. 
 The main thread then waits at that point until the threads complete the code within their run() methods.

//Example
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

        // Wait until the threads complete
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // The two threads are done at this point
        System.out.println("Finishing main()");
    }
}

//Output
Hello 1 from Thread-0
Hello 2 from Thread-0
Hello 3 from Thread-0
Hello 4 from Thread-0
Hello 5 from Thread-0
Hello 1 from Thread-1
Hello 2 from Thread-1
Hello 3 from Thread-1
Hello 4 from Thread-1
Hello 5 from Thread-1
Finishing main()

  
