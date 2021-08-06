package cs520.module2.L1_classes;

class P06_StaticClassExample {

	// Static variables
	public static int studentScore1 = 80;
	public static int studentScore2 = 90;
	public static int studentScore3 = 100;

	// Instance variables
	public String studentName1 = "John";
	public String studentName2 = "Sally";
	public String studentName3 = "Fred";

	// Static method
	public static int getStudentAverage() {
		return ((studentScore1 + studentScore2 + studentScore3) / 3);
	}

	// Instance method
	public String getStudentNames() {
		return this.studentName1 + ", " + this.studentName2 + ", " + this.studentName3;
	}

	// Static method trying to use an instance variable
	// public static int getStudent3Name() {
	// return studentName3; // Invalid code! Static methods cannot use instance
	// variables or methods
	// }

	// Instance method using static variable
	public int getHighestScore() {
		// This instance method uses a static variable; nothing wrong with that
		return studentScore3;
	}
}
