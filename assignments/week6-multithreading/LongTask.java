package cs520.hw6;

public class LongTask extends Thread {
    private SharedResults sharedData;
    private StringBuffer inputData;
    private char target;

    public LongTask(SharedResults sharedData, StringBuffer inputData, char target) {
        super("Thread_"+target);
        this.sharedData = sharedData;
        this.inputData = inputData;
        this.target = target;
    }
    
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " running.");

        int count = 0;
        for (int i = 0; i < inputData.length(); i++) {
            if (inputData.charAt(i) == target)
                count++;
        }

        ResultsEntry entry = new ResultsEntry(count, this.target);
        sharedData.addToResults(entry);
    }
}
