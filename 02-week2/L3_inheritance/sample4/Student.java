package cs520.module2.L3_inheritance.sample4;

public class Student extends Person {
	// Instance variables
	private String program;
	private double homeworkScore;
	private double examScore;

	// Constructors
	public Student() {
		super();
		program = "Not Specified";
	}

	public Student(String theName, String theId) {
		super(theName, theId);
		program = "Not specified";
	}

	public Student(String theName, String theId, String theProgram) {
		super(theName, theId);
		program = theProgram;
	}

	// Set and get methods
	public void setProgram(String theProgram) {
		program = theProgram;
	}

	public String getProgram() {
		return program;
	}

	public void setHomeworkScore(double score) {
		homeworkScore = score;
	}

	public double getHomeworkScore() {
		return homeworkScore;
	}

	public void setExamScore(double score) {
		examScore = score;
	}

	public double getExamScore() {
		return examScore;
	}

	public double computeScore() {
		return 0.5 * getHomeworkScore() + 0.5 * getExamScore();
	}

	public String toString() {
		return "Student[" + getName() + " : " + getId() + " : " + getProgram() + "]";
	}
}