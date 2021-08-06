package cs520.module4.L3_types;

import java.util.ArrayList;
import java.util.List;

/**
 * This example covers autoboxing, which is not currently part of CS520.
 * If you are interested, visit https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html 
 */

public class P03_Autoboxing {

	public static void main(String[] args) {
		
		// How things used to be done before parameterized types and autoboxing;
		// the following line should cause a compiler warning
		List myList = new ArrayList();
		myList.add(new Integer(5)); // Could not add raw primitive
		Integer myInteger = (Integer)myList.get(0);
		int myInt = myInteger.intValue();
		System.out.println(myInt + " * 10 = " + (myInt * 10));
		
		// With parameterized types and autoboxing
		List<Integer> myList2 = new ArrayList<Integer>();
		myList2.add(5); // Add raw primitive
		System.out.println(myList2.get(0) + " * 10 = " + (myList2.get(0) * 10));
		
	}
	
}
