wait() and notify()
  The wait() and notify() methods are declared in the java.lang.Object class, which is the root class of all Java classes. 
  When a thread that owns the lock on an object instance executes the wait() method on it, 
the thread enters into a wait state in which it releases its ownership of the object lock. 
  When another thread invokes the notify() method on the shared object instance, the first thread exits its wait state and resumes execution from that point.
  
  public synchronized void withdraw(int amount) {
    while (amount > this.balance) {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    this.balance -= amount;
}
//The wait() method may throw an InterruptedException if the thread is somehow interrupted while it is in the wait state.

public synchronized void deposit(int amount) {
    this.balance += amount;
    notify();
}
//when deposit() is called, the notify() method is invoked. This causes the thread waiting to withdraw to proceed.

The lifecycle of a thread can be described based on its state:

When a thread is created, it is in the NEW state.
When the start() method is invoked, the thread is in the RUNNABLE state.
The thread goes into the BLOCKED state if it is waiting to acquire the lock on an object instance.
When the thread acquires the lock, it is again in the RUNNABLE state.
A thread goes into the WAITING state if it is waiting indefinitely for another thread to perform a particular action.
If an other thread notifies the thread, it goes back to the RUNNABLE state.
When the run() method is complete, the thread goes into a TERMINATED state.

   
