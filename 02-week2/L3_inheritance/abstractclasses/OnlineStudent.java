package cs520.module2.L3_inheritance.abstractclasses;

public class OnlineStudent extends Student {

    public void walk() {
         // walk
    }

    public void talk() {
        // talk
    }

    public void sleep() {
        // sleep
    }

	public double computeHomeworkScore() {
        super.computeExamScore();
        this.computeExamScore();
        return 95.5;


    }
  
     public double computeExamScore() {
         return 84.0;
     }
  
	public double computeScore() {
		return super.computeScore();
	}

}
