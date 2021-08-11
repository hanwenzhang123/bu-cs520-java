When multiple threads are executing concurrently and working on the same data, 
thread interference may cause problems with the data, yielding inconsistent results.
  
  public class Account {

    private int balance = 0;

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }
}

To avoid such inconsistencies in the data, the operations must be synchronized. 
  When a thread is executing an operation that manipulates the shared data, 
no other thread should be allowed to invoke any operation that also needs to manipulate the shared data. 
  The synchronization is achieved by acquiring a lock on the object instance. 
  The thread that acquires the lock may invoke the operations that instance. 
  During the time in which the lock is held, 
any other thread trying to access the instance must wait until the first thread completes its execution and relinquishes the lock. 
  Each Java object instance has an implicit lock (also known as its monitor)
  
  
  A straightforward solution requires the keyword synchronized to be used:

public class Account {

    private int balance = 0;

    public synchronized void deposit(int amount) {
        this.balance += amount;
    }

    public synchronized void withdraw(int amount) {
        this.balance -= amount;
    }
}

If the operations are long and only a few lines of the code require synchronization, 
then locking the object until the entire operation completes defeats the purpose of concurrency.
  public class Account {

    private int balance = 0;

    public void deposit(int amount) {
        synchronized (this) {
            this.balance += amount;
        }
    }

    public void withdraw(int amount) {
        synchronized (this) {
            this.balance -= amount;
        }
    }
}

The two threads are now free to execute the operations concurrently. 
  Only the code surrounded by the synchronized block requires the thread to hold a lock on the object instance.
  
  //To avoid negative balance
  public synchronized void withdraw(int amount) {
    while (amount > this.balance) {
        // do something
    }
    this.balance -= amount;
}
