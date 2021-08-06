package cs520.module3.L1_strings;

public class P01_StringTest {
	public static void main(String[] args) {
		String input = "Hello! How are you?";

		//////////////////////////////////////

		int len = input.length();
		// returns 19
		System.out.println(len);

		//////////////////////////////////////

		int pos;

		pos = input.indexOf('H');
		// returns 0

		System.out.println(pos);

		pos = input.indexOf('H', pos + 1);
		// returns 7
		System.out.println(pos);

		pos = input.indexOf('H', pos + 1);
		// returns -1
		System.out.println(pos);

		//////////////////////////////////////

		boolean isPrefix;

		isPrefix = input.startsWith("Hello");
		// returns true
		System.out.println(isPrefix);

		isPrefix = input.startsWith("Java");
		// returns false
		System.out.println(isPrefix);

		isPrefix = input.startsWith("");
		// always will return true
		System.out.println(isPrefix);

		//////////////////////////////////////

		boolean isSuffix;

		isSuffix = input.endsWith("?");
		// returns true
		System.out.println(isSuffix);

		isSuffix = input.endsWith("you");
		// returns false
		System.out.println(isSuffix);

		isSuffix = input.endsWith("");
		// always will return true
		System.out.println(isSuffix);

		//////////////////////////////////////

		String result;

		result = input.substring(7);
		// returns "How are you?"
		System.out.println(result);

		result = input.substring(15);
		// returns "you?"
		System.out.println(result);

		result = input.substring(0);
		// returns "Hello! How are you?"
		System.out.println(result);

		result = input.substring(len);
		// returns ""
		System.out.println(result);

		/////////////////////////////////////

		result = input.substring(0, 5);
		// returns "Hello"
		System.out.println(result);

		result = input.substring(0, 6);
		// returns "Hello?"
		System.out.println(result);

		result = input.substring(7, 10);
		// returns "How"
		System.out.println(result);

		result = input.substring(15, 17);
		// returns "yo"
		System.out.println(result);

		result = input.substring(18, 19);
		// returns "?"
		System.out.println(result);

		result = input.substring(5, 6);
		// returns "!"
		System.out.println(result);

		result = input.substring(5, 5);
		// returns ""
		System.out.println(result);

		////////////////////////////////////

		result = input.replace('H', 'h');
		// returns "hello? how are you?"
		System.out.println(result);

		////////////////////////////////////

		result = input.toLowerCase();
		// returns "hello! how are you?"
		System.out.println(result);

		////////////////////////////////////

		result = input.toUpperCase();
		// returns "HELLO! HOW ARE YOU?"
		System.out.println(result);

		////////////////////////////////////

		String test = "    This is a test with spaces  		  ";
		result = test.trim();
		// returns "This is a test with spaces"
		System.out.println(result);

		////////////////////////////////////

		boolean isEqual;

		String firstString = "Hello";
		String secondString = "Hello";

		isEqual = firstString.equals(secondString);
		// returns true
		System.out.println(isEqual);

		isEqual = firstString.equals("hello");
		// returns false
		System.out.println(isEqual);

		isEqual = "Java".equals("Java");
		// returns true
		System.out.println(isEqual);

		isEqual = "java".equals("Java");
		// returns false
		System.out.println(isEqual);

		///////////////////////////////////////////

		firstString = "Hello";
		secondString = "hello";

		isEqual = firstString.equalsIgnoreCase(secondString);
		// returns true
		System.out.println(isEqual);

		isEqual = firstString.equalsIgnoreCase("hElLo");
		// returns true
		System.out.println(isEqual);

		isEqual = "Java".equalsIgnoreCase("Java");
		// returns true
		System.out.println(isEqual);

		isEqual = "java".equalsIgnoreCase("JAVA");
		// returns true
		System.out.println(isEqual);

		//////////////////////////////////////////
		firstString = "Hello";
		secondString = "Hello";

		pos = firstString.compareTo(secondString);

		// returns 0
		System.out.println(pos);

		secondString = "Hi";

		pos = firstString.compareTo(secondString);
		// returns -4
		System.out.println(pos);

		secondString = "Bye";

		pos = firstString.compareTo(secondString);
		// returns 6
		System.out.println(pos);

		//////////////////////////////////////////

		int iValue;
		double dValue;

		input = "123"; // a sequence of three characters
		iValue = Integer.parseInt(input);

		// returns the integer 123
		System.out.println(iValue);

		input = "123.45"; // a sequence of 6 characters
		dValue = Double.parseDouble(input);
		// returns the double 123.45
		System.out.println(dValue);

		///////////////////////////////////////////////

		boolean bValue;
		char cValue;

		iValue = 123;
		result = String.valueOf(iValue);
		// returns the string "123"
		System.out.println(result);

		dValue = 123.45;
		result = String.valueOf(dValue);
		// returns the string "123.45"
		System.out.println(result);

		bValue = true;
		result = String.valueOf(bValue);
		// returns the string "true"
		System.out.println(result);

		cValue = 'A';
		result = String.valueOf(cValue);
		// returns the string "A"
		System.out.println(result);

		//////////////////////////////////////

		firstString = "hello";
		secondString = "how are you";

		result = firstString + secondString;
		// returns "hellohow are you"
		System.out.println(result);

		result = firstString + " " + secondString;
		// returns "hello how are you"
		System.out.println(result);

		result = firstString + '!' + ' ' + secondString + "?";
		// returns "hello! how are you?"
		System.out.println(result);

		result = "Hi! " + secondString; // returns "Hi! how are you"
		System.out.println(result);

		result = "It is " + 10 + 20 + secondString;
		// It is 1020 how are you
		System.out.println(result);

		result = 10 + 20 + secondString + 10 + 20;
		System.out.println(result);
		// 30how are you1020

		result = 10 + 20 + secondString + (10 + 20);
		System.out.println(result);
		// 30how are you30

		///////////////////////////////////

		iValue = 123;
		dValue = 45.6;
		bValue = true;

		result = "The output is " + iValue + ";" + dValue + ";" + bValue;
		// returns "The output is 123;45.6;true"
		System.out.println(result);

		result = String.valueOf(iValue) + " is the result";
		// returns "123 is the result"
		System.out.println(result);

	}

}
