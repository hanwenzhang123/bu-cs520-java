package cs520.module2.L3_inheritance.abstractclasses;

public abstract class Student extends Person {

	public abstract double computeHomeworkScore();
  
	public double computeExamScore() {
		return 88.8;
	}
  
	public double computeScore() {
		return 0.5 * this.computeHomeworkScore() + 0.5 * this.computeExamScore();
	}

}
