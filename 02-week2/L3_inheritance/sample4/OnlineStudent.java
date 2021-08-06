package cs520.module2.L3_inheritance.sample4;

public class OnlineStudent extends Student {
	// Instance variable
	private double discussionScore;

	// Constructors
	public OnlineStudent() {
	}

	public OnlineStudent(String theName, String theId) {
		super(theName, theId);
	}

	public OnlineStudent(String theName, String theId, String theProgram) {
		super(theName, theId, theProgram);
	}

	// Set and get methods
	public void setDiscussionScore(double score) {
		discussionScore = score;
	}

	public double getDiscussionScore() {
		return discussionScore;
	}

	// Return a string representation of this object
	public double computeScore() {
		return 0.4 * getHomeworkScore() + 0.4 * getExamScore() + 0.2 * getDiscussionScore();
	}
}
