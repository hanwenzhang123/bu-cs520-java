It is important to recognize that exceptions only occur while compiled code is running. 
    Errors made when writing code that prevent compilation are not within the scope of exception handling. 

//Exception Class Hierarchy
    The Throwable class is the root of all exception classes. 
    Its two main subclasses are Error and Exception.


//Handling Exceptions
Exceptions are handled using try...catch statement blocks with the following structure:

The subclasses under the Error class are reserved for serious conditions that the programmer could not expect to occur and should not attempt to handle within the application. 
The subclasses under the Exception class are the ones that are thrown by various operations to represent undesirable outcomes.        
    
    
//Handling Exceptions
Exceptions are handled using try...catch statement blocks with the following structure:
    
// Statements that are not within the try/catch scope
try {
    // Statements that may throw exceptions
} catch (Exception e) {
    // Code to handle the exception
}
// Program continues with the remaining code

When any of the statements in the try block throw an exception, the remaining statements within the block are skipped and the control immediately transfers to the code in the catch block. 
    
try {
    FileReader reader = new FileReader("file.txt");
} catch (FileNotFoundException e) {
    // Handle the exception
}

try {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the filename: ");
    String filename = scanner.nextLine();
    FileReader reader = new FileReader(filename);
} catch (Exception e)  {
    // Handle the exception
}
  

//try-catch-finally
In the examples seen so far, when an exception occurs, the program skips the remaining statements in the try block. 
    In cases when certain portions of code must be executed whether an exception occurs or not, the try-catch-finally construct is used. 
try  {
    // Perform operations
} catch (Exception e) {
    // Do something with the exception (or not)
} finally {
    // Code that will always execute whether or not an exception occurred
}
