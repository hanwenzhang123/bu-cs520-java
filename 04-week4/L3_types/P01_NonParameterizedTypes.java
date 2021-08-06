package cs520.module4.L3_types;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * This is an example of data structures without parameterized types.
 * It is shown to illustrate how data structures functioned before the
 * introduction of parameterized types, which should always be used.
 * You should see yellow warning lines under some of the code; this is
 * Eclipse warning that parameterized types should be used.
 * Please use this code not as a pattern to follow but for comparison
 * purposes with P02_ParameterizedTypes.
 */

public class P01_NonParameterizedTypes {

	public static void main(String[] args) {
		List myList = new ArrayList();
		myList.add("I'm a String");
		myList.add(new Employee("Alice"));
		myList.add(new Integer(5));

		ListIterator iterator = myList.listIterator();
		
		while (iterator.hasNext()) {
			// iterator.next() returns a value of type Object
			Object o = iterator.next();
			
			// Print the type of this value
			System.out.println("Object #" + iterator.nextIndex() + " is of type " + o.getClass().getName());
			
		    // Check whether the value is an integer
			if (o instanceof Integer) {
				// Cast the object to an Integer
				Integer myInt = (Integer)o;
				int myValue = myInt.intValue() * 10;
				System.out.println(o + " * 10 = " + myValue);
			}
		}		
	}

}
