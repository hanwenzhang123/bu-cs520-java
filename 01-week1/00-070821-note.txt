What is OOP?
  Everything is an object
  objects are brought to life as instances
  similar objects are grouped as classes
  objects have attributes that describe instances
  objects methods define instance behavior
  methods are invoked by other classes and methods
  
Applications
  The vast majority of java implements you will see today are applications
  
Java source code and bytecode
  souce code is a set of human-intelligible set of instructions
  the target system does not actually run your source code
  interpreters vs compilers
    java is a high-level complied language
    source code must be compiled to bytecode - what the computer actually runs
  java source code is kept in .java files
  complied code (bytecode) is kept in .class files
  the complier converts .java to .class
  compiled code must run within a java virtual machine (JVM)
    JVM is a runtime environment that assures the same behavior on any type of operating system
  java can be compiled at the command line with the javac command
  
Running Java Programs
  when an application starts, the classloader gathers all of the necessary classes and bootstraps the jvm
  classes needed to run a program must be in a classpath
  the java command runs compiled java code
  the starting point of every java application is a method called main():
    public static void main(String[] args) {
      //statement codes
    }

classes are files
  file name must match the class name, kepp it consistently
  
Statements and blocks
  A statement is one instruction and must end with a semicolon;
  statement that perform a unified function are often put in a block
  blocks are usually denoted with {}, usually on the same line
  code should be written legibly
    indentation and spacing must be consistent and logical even though the java compiler does not care about it
    consistency with tabs vs spaces
    long lines of code should wrap; the statement does not end until a ;
    naming conventions are important  
    
Documenting your code
  it is very important to describe what your code is doing 
  other programmer will appreicate it and you will too
  can just be one line, designated with//

Variables
  variables hold values
    can be given any legal identifier(name), but the name should represent what variable holds
  java is case-sensitive
  variables passed to methods are called arguments
  variables are of a given type, for example, String, int, and boolean
  Stirngs are collections of characters, like "java"
  whole numbers are often stored in int types
  
=..and its two meanings
  the = symbol is used in two very different way:
    a single equal = sign is an asssignment operator
    a double equal == sign is an equality test
  
Variable declaration and assignment
  variable must be declared, with their type provided
    String myString;
  The equal sign = denotes variable assignment
    String myString = "Hello";
  If not assigned a value, variables assume a default
      numeric types: 0
      boolean: false
      String(and most every other class): null
  null is a special value
  
Java is a "strongly types" language
- variable may only contain legal values for their typoe
- an error will result from assigning an illegal value
- the process of converting value to fit a different variable type is called casting
- the cast type is found in parentheses

primitives
- very common class types are reduced to a more convenient form called primitives
- primitives are all lower case letters
- classes are start with upper case letters

Package
it is a way to group your classes, and we will get into it later
a grouping of classes or in other words, a way to specify a namespace
this all has to do with accessibility or scoping, but again concepts that we will cover in a bit
  
Scanner class
Scanner scanner = new Scanner(system.in);
String input = scanner.nextline();  
  
