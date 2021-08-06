package cs520.module2.L3_inheritance.sample3;

import cs520.module2.L3_inheritance.sample2.Person;

public class Example3 {
	public static void main(String[] args) {
		Person p1, p2;
		Student s1, s2, s3;
		Faculty f1, f2, f3, f4;

		// Create Person objects
		p1 = new Person();
		p2 = new Person("Alice", "123-45-1000");

		// Create Student objects
		s1 = new Student();
		s2 = new Student("S2", "Id2");
		s3 = new Student("S3", "Id3", "Program3");

		// Create Faculty objects
		f1 = new Faculty();
		f2 = new Faculty("F2", "Id10");
		f3 = new Faculty("F3", "Id11", "Assistant Prof");
		f4 = new Faculty("F4", "Id12", "Assistant Prof", "Computer Science");

		System.out.println("First Person: " + p1 + "\n" + "Second Person: " + p2 + "\n\n" + "First Student: " + s1
			+ "\n" + "Second Student: " + s2 + "\n" + "Third Student: " + s3 + "\n\n" + "First Faculty: " + f1
			+ "\n" + "Second Faculty: " + f2 + "\n" + "Third Faculty: " + f3 + "\n" + "Fourth Faculty: " + f4);
	}
}
