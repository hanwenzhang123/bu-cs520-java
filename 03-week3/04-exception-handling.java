




//Handling Exceptions
Exceptions are handled using try...catch statement blocks with the following structure:

// Statements that are not within the try/catch scope
try {
    // Statements that may throw exceptions
} catch (Exception e) {
    // Code to handle the exception
}
// Program continues with the remaining code



//try-catch-finally
try  {
    // Perform operations
} catch (Exception e) {
    // Do something with the exception (or not)
} finally {
    // Code that will always execute whether or not an exception occurred
}
