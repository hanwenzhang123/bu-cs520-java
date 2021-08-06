package cs520.module2.L3_inheritance.sample1;

public class Person {
	// Instance variables
	private String name;
	private String id;

	public Person() {
		this.name = "Unknown";
		this.id = "000-00-0000";
	}

	// Constructor with two arguments
	public Person(String theName, String theId) {
		this.name = theName;
		this.id = theId;
	}

	// Public methods
	public void setName(String name) {
		this.name = name.toUpperCase();
	}

	public String getName() {
		return this.name;
	}

	public void setId(String newId) {
		id = newId;
	}

	public String getId() {
		return id;
	}

	// Return a string representation of this object
	public String toString() {
		return "Person : " + this.name + " : " + this.id;
	}
}
