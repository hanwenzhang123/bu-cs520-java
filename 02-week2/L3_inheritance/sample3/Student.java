package cs520.module2.L3_inheritance.sample3;

class Student extends Person {
	// instance variable specific to Student
	private String program;

	// The default constructor
	public Student() {
		super();
		program = "Not Specified";
	}

	// Constructor with two arguments
	public Student(String theName, String theId) {
		super(theName, theId);
		program = "Not specified";
	}

	// Constructor with three arguments
	public Student(String theName, String theId, String theProgram) {
		super(theName, theId);
		program = theProgram;
	}

	public void setProgram(String theProgram) {
		program = theProgram;
	}

	public String getProgram() {
		return program;
	}

	// Return a string representation of this object
	public String toString() {
		return "Student[" + getName() + ": " + getId() + ": " + getProgram() + "]";
	}
}