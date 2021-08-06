package cs520.module2.L3_inheritance.sample4;

public class Example4 {
	public static void main(String[] args) {
		TraditionalStudent s2;

		// Create an OnlineStudent and set its properties
		Student s1 = new OnlineStudent("Bob", "321-456-1234", "MS in CIS");
		s1.setHomeworkScore(90.0);
		s1.setExamScore(75.0);
		//s1.setDiscussionScore(100.0);
		s1.getName();

		// Create a TraditionalStudent and set its properties
		s2 = new TraditionalStudent("Alice", "456-324-3456", "MS in CS");
		s2.setHomeworkScore(90.0);
		s2.setExamScore(75.0);

		// Display the scores
		System.out.println(s1.getName() + "'s score is " + s1.computeScore() + "\n" + s2.getName() + "'s score is "
			+ s2.computeScore());
	}
}
