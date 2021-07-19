//String Declarations

Variables representing string objects are declared using the String class types as follows:
String s;
String input, result;

The String class is a built-in Java class 
"abc123"
"    a b c    " (The space at the beginning and end is part of the string)
"I said \"Let's go!\"" (Double quotes within strings are escaped with backslashes)
"Все дороги ведут в Рим" (Any valid Unicode characters)
"" (Empty string but just as valid as other strings)

As with other variable types, strings can be declared and assigned initial values at the same time:
String schoolName = "Boston University";

The constructor of the String class can also be used to create string objects, though this is rarely necessary:
String test = new String("Java");


//String Methods
String input = "Hello! How are you?";

//length() - Computes the length (size) of the given string:
int len = input.length();  // length is 19

//charAt() - Returns the character at the given index position within the string, The index value range begins with zero.
char firstChar = input.charAt(0); // the character 'H'
char secondChar = input.charAt(1); // the character 'e'
char lastChar = input.charAt(input.length() - 1); // the character '?'
char lastButOneChar = input.charAt(input.length() - 2); // the character 'u'

//indexOf() - Computes the index (position) of the occurrence of a particular character within a string. 
int position = input.indexOf('H'); // returns 0
//A value of -1 is returned if there is no such occurrence.
//To find the next occurrence, we need to start looking from position + 1:
position = input.indexOf('H', position + 1); // returns 7 
// invoking the method one more time as above will return -1, since this is the last occurrence

//startsWith() - Checks whether a string begins with a particular substring. The method returns a boolean result.
boolean isPrefix;
isPrefix = input.startsWith("Hello");   // returns true
isPrefix = input.startsWith("Java");    // returns false
isPrefix = input.startsWith("");        // always will return true

//endsWith() - Checks whether a string ends with a particular substring. The method returns a boolean result.
boolean isSuffix;
isSuffix = input.endsWith("?"); // returns true
isSuffix = input.endsWith("you"); // returns false
isSuffix = input.endsWith("");  // always will return true

//substring() - The start index of the substring is passed as the argument to the method. Returns a new string that is a substring of the given string. 
String result;
result = input.substring(7); // returns "How are you?"
result = input.substring(15); // returns "you?"
result = input.substring(0); // returns "Hello! How are you?"
result = input.substring(input.length()); // returns "" (empty string)
//The method returns the substring starting at the start and ending at the end position, the method takes two arguments
result = input.substring(0, 5); // returns "Hello"
result = input.substring(0, 6); // returns "Hello!"
result = input.substring(7, 10); // returns "How"
result = input.substring(15, 17); // returns "yo"
result = input.substring(18, 19); // returns "?"
result = input.substring(5, 6); // returns "!"
result = input.substring(5, 5); // returns "" (end index same as start index)

//replace() - Returns a copy of the string with all occurrences of a given substring replaced with a ne
w string. 
result = input.replace("e", "x"); // returns "Hxllo! How arx you?"
  
//toLowerCase() - Returns a copy of the string converted to lowercase. Non-letter characters are unchanged.
result = input.toLowerCase(); // returns "hello! how are you?"
  
//toUpperCase() - Returns a copy of the string converted to lowercase. Non-letter characters are unchanged.
result = input.toUpperCase(); // returns "HELLO! HOW ARE YOU?"
  
//trim() - Returns a copy of a string with any leading and trailing whitespace removed. 
String test = "    This is a test with spaces    ";
result = test.trim();   // returns "This is a test with spaces"

//equals() - Strings always case-sensitive. Returns boolean result indicating whether the string argument contains the same characters in the same sequence. 
boolean isEqual;
String firstString = "Hello";
String secondString = "Hello";
isEqual = firstString.equals(secondString); // returns true
isEqual = firstString.equals("Hello"); // returns true
isEqual = "java".equals("Java"); // returns false
isEqual = " java ".equals("java"); // returns false 

//equalsIgnoreCase() - Same as equals() except that case is ignored.
boolean isEqual;
String firstString = "Hello";
String secondString = "hello";
isEqual = firstString.equalsIgnoreCase(secondString); // returns true
isEqual = firstString.equalsIgnoreCase("hello"); // returns true
isEqual = "java". equalsIgnoreCase("Java"); // returns true
isEqual = "java". equalsIgnoreCase("JAVA"); // returns true
isEqual = " java ". equalsIgnoreCase("JAVA"); // false because of whitespace 

//compareTo()
/*
Compares two strings lexicographically
returns an integer value of 0 if the string is equal to the argument string, 
a negative value if the string lexicographically precedes the string argument,
a value greater than zero if the string lexicographically succeeds the string argument.
*/
String firstString = "Hello";
String secondString = "Hello";

int position = firstString.compareTo(secondString); // returns 0 (equal)

secondString = "Hi";
position = firstString.compareTo(secondString); // returns -4

secondString = "Bye";
position = firstString.compareTo(secondString); // returns 6 

//Similar to equalsIgnoreCase(), compareToIgnoreCase() compares two strings but ignoring case differences.
//Strings should never be compared using the double equals (==) sign. This operator is only valid for comparing primitive values.  
   

//String Conversions
To convert the string into a primitive type, it must be converted using a parser method.

String input = "123"; // a sequence of three characters
int multiplyIt = input * 10; // this won't work! input is a string

int iValue = Integer.parseInt(input); // returns the integer 123
int multiplyIt = iValue * 10; // now we can do math

input = "123.45"; // a sequence of 6 character
double dValue = Double.parseDouble(input); // returns the double 123.45 
  
  
The other primitive types have similar parser methods, such as Boolean.parseBoolean() and Float.parseFloat().
  
  
//Composing Strings
New strings may be composed from existing values. A common use case is to convert a primitive value to a string. 
To do so, the String class provides a static valueOf() method with many overloaded forms to accept any type of primitive value.

int iValue = 123;
String result = String.valueOf(iValue); // returns the string "123"

double dValue = 123.45;
result = String.valueOf(dValue); // returns the string "123.45"

boolean bValue = true;
result = String.valueOf(bValue); // returns the string "true"

char cValue = 'A';
result = String.valueOf(cValue); // returns the string "A"

To combine strings, the concatenation operator (+) is used:

String result;
String str1 = "hello";
String str2 = "how are you";
result = str1 + str2; // returns "hellohow are you"
result = str1 + " " + str2; // returns "hello how are you"
result = str1 + '!' + " " + str2 + "?"; // returns "hello! how are you?"
result = "Hi! " + str2; // returns "Hi! how are you"
  
Java will automatically convert the non-string values to strings. For example:

String str1 = "hello";
boolean b = true;
int i = 5;
String result = str1 + b + 5; // returns the string "hellotrue5"
  
String str1 = "hello" + 4 + 5; // "hello45", not "hello9". This is because a string is found before the + between the two numbers is found. 
String str1 = 4 + 5 + "hello" + 4 + 5; //"9hello45". Until the first string is found, + can operate as a mathematical addition operator.

  
//Splitting Strings
the static split() method that is built into the String class
  This method accepts a delimiter as its argument, which is the substring upon which to split. 
  
String fruits = "apples, bananas, oranges";
String[] parts = fruits.split(", ");  //look for ", " then seperated as String 

//"apples", "bananas" and "oranges"

//example
String str = "Hello-Welcome-to-Java-World";
String parts[] = str.split("-");

{"Hello", "Welcome", "to", "Java", "World"}

