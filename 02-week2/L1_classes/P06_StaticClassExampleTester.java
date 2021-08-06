package cs520.module2.L1_classes;

public class P06_StaticClassExampleTester {

	public static void main(String[] args) {

		// Read a static variable
		System.out.println("The initial value of studentScore1 is " + P06_StaticClassExample.studentScore1);

		// // Manipulate a static variable; this will change its value
		P06_StaticClassExample.studentScore1 += 10;
		System.out.println("The value of studentScore1 is now " + P06_StaticClassExample.studentScore1);

		// Call a static method; note that we did not have to use "new StaticClassExample()"
		int avg = P06_StaticClassExample.getStudentAverage();
		System.out.println(avg);

		// // We can still instantiate the class, because the class itself is not static
		P06_StaticClassExample example = new P06_StaticClassExample();
		P06_StaticClassExample example2 = new P06_StaticClassExample();

		// Now we can call instance methods using the instance of the class
		String names = example.getStudentNames();
		System.out.println("Student names: " + names);

		// What if we try to use the instance method in a static way?
		//names = StaticClassExample.getStudentNames(); // Invalid code, will not compile

		// Or a static method using a class instance?
		// This is valid code, but not advisable; will cause compiler warning
		avg = example.getStudentAverage();
		System.out.println("Student average: " + avg);
		//
		// // Last test -- call an instance method that uses a static variable
	int highestScore = example.getHighestScore(); // No problem
		System.out.println("The highest score is " + highestScore);
	}

}
