package cs520.module2.L3_inheritance.sample2;

public class Example2 {
	public static void main(String[] args) {
		// Create the Person objects
		Person p1 = new Person();
		Person p2 = new Person("Alice", "123-45-1000");

		// Create a Student object
		Student s1 = new Student();
		System.out.println(s1.age);

		// // Create a Faculty object
		// Faculty f1 = new Faculty();

		// System.out.println("First Person: " + p1 + "\n" + "Second Person: " + p2 + "\n" + "First Student: " + s1 + "\n"
		// 	+ "First Faculty: " + f1);
	}
}
