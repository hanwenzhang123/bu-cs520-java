package cs520.module2.L3_inheritance.sample3;

class Person {
	private String name;
	private String id;

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
	public void setName(String name) {
		this.name = name;
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
		return "Person : " + name + " : " + id;
	}
}