package cs520.hw6;

import java.util.ArrayList;
import java.util.Collection;

public class SharedResults {
    private Collection<ResultsEntry> results = null;

    public SharedResults() {
        this.results = new ArrayList<ResultsEntry>();
    };

    public synchronized void addToResults(ResultsEntry entry){
        System.out.println(Thread.currentThread().getName()
                + " is adding " + entry);
        results.add(entry);
        System.out.println("Cumulative results are " + results);
    }

    public synchronized int getResult(){
        int sum = 0;
        for (ResultsEntry entry : results)  {
            sum += entry.getCount();
        }
        return sum;
    }
}
