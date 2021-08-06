package cs520.module2.L3_inheritance.sample1;

public class Example1 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Alice", "123-45-1000");
		Person p3 = new Person("Bob", "456-78-2000");

		System.out.println("First Person: " + p1 + "\n" + "Second Person: " + p2.toString() + "\n" + "Third Person: "
			+ p3.toString());
	}
}