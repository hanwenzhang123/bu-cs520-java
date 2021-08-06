package cs520.module2.L3_inheritance.sample2;

public class Person {
	// Instance variables
	private String name;
	private String id;
	protected int age = 10;

	// Default constructor
	public Person() {
		name = "Unknown";
		id = "000-00-0000";
	}

	// Constructor with two arguments
	public Person(String theName, String theId) {
		name = theName;
		id = theId;
	}

	// Public methods
	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return "Mr. Person";
	}

	public void setId(String newId) {
		id = newId;
	}

	public String getId() {
		return id;
	}

	// Return a string representation of this object
	public String toString() {
		return "Person : " + name + " : " + id;
	}
}