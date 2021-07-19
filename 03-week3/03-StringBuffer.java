//The StringBuffer Class
String objects are immutable (unchangeable). This means that once the string object is created, it cannot be modified.

String input = "abc";
input = input + "123";  //input += "123";
//"abc123"

It appears that input has been updated with the new value, but that is not what is actually occurring behind the scenes. 
Java discards the original input string and then creates a new one with the new value. 
From the JVM's perspective, these are two entirely separate objects.
  
The StringBuffer and the StringBuilder classes (in the java.lang package) can store strings and provide operations to manipulate them as objects. 
  
StringBuffer offers the following constructors:
StringBuffer() creates a StringBuffer object with no characters. This object represents the empty string ("").
StringBuffer(String input) creates a StringBuffer object using the specified string.
  
StringBuffer offers the following methods to inspect and alter its contents. The methods marked with * are destructive; they alter the content of the string contained within the StringBuffer.
  
charAt(int index): Returns the character within the string at the specified index.
delete(int startIndex, int endIndex)*: Removes characters from the specified start index (inclusive) to the specified end index (exclusive).
deleteCharAt(int index)*: Removes the character at the specified index.
indexOf(String input): Returns the starting index of the first occurrence of the specified input within the underlying string. If there is no match, a value of -1 is returned.
indexOf(String input, int beginIndex): Returns the starting index of the first occurrence of the specified input within the underlying string starting from the specified index. If there is no match, a value of -1 is returned.
insert(int offset, data)*: Takes any of the primitive data type values and inserts it at the specified offset of the current string representation. If an object is specified as the argument, the toString() representation of the object type is used.
lastIndexOf(String input): Returns the starting index of the last occurrence of the specified input within the underlying string. If there is no match, a value of -1 is returned.
lastIndexOf(String input, int beginIndex): Returns the starting index of the last occurrence of the specified input within the underlying string starting from the specified index. If there is no match, a value of -1 is returned.
length(): Returns the length (number of characters) of the string representation.
replace(int startIndex,int endIndex, String input)*: Replaces the characters from the specified start index (inclusive) to the specified end index (exclusive) with the specified input string.
reverse()*: Reverses the underlying string, so "abc" becomes "cba".
setCharAt(int index, char input)*: Replaces the character at the specified index with the input character.
substring(int startIndex): Returns a new string using the characters in the underlying string from the specified start index.
substring(int startIndex, int endIndex): Returns a new string using the characters in the underlying string from the specified start index (inclusive) to the specified end index (exclusive).
toString(): Returns a plain string representing the underlying string.

The destructive methods marked with * above all return the StringBuffer instance itself. This is handy to create a chain of methods:

StringBuffer fruits = new StringBuffer("apples");
fruits.append(", oranges").insert(6, ", bananas").replace(0, 1, "A");
System.out.println(fruits); // Result: Apples, bananas, oranges 


