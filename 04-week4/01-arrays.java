Java provides a data type called an array that allows us to define a single variable that has multiple values of the same type. 
  These values, called elements, may be accessed through an index value that represents the position of the element within the array. 
  Thus, the elements are also called indexed variables.

To define an array variable, we need:
- The type of the elements, called the base type
- The name of the array (any legal identifier)
- The number of elements in the array, called the size or length of the array, which could be any expression that evaluates to a non-negative integer value.
  
//Declaring and Creating Arrays
Array variables are declared using square brackets: [ ].
// Declare an array of integer values
int[] salaries;

Before assigning the values for the array elements, the size for the array must be allocated by specifying the number of elements that the array will hold. 
  Arrays cannot be initialized without their size declared.

// Allocate the size of the array
salaries = new int[5];
// Not legal code, as the size must be provided
salaries = new int[];
    
// Declare and allocate an array of integers
int[] salaries = new int[5];

The above array holds 5 elements. 
The individual elements of the array are accessed using the [ ] notation: salaries[0], salaries[1], salaries[2], salaries[3] and salaries[4]. 

  // Initialize the values of the array
salaries[0] = 50000;
salaries[1] = 51000;
salaries[2] = 52000;
salaries[3] = 53000;
salaries[4] = 54000;

int[] salaries = {50000, 51000, 52000, 53000, 54000};
// Note that the values are provided within curly braces, not square brackets. 
// The variable type only needs to be declared on the left side, and the explicit size is not given. 
// This is because Java can determine the size automatically based on the number of elements provided.

A String array could also be created to hold the employees' names:
String[] names = {"Alice", "Bob", "Charlie", "Dave", "Ed"};


//Arrays of Custom Objects
public class Employee {

    private String name;
    private int salary;

    // Constructor
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter methods (setter methods not implemented)
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return String.format("(%s, %s)", name, salary);
    }
}

public class P02_ArrayOfEmployees {

    public static void main(String[] args) {
        // Declare an array of Employee objects
        Employee[] employees = new Employee[5];

        // Initialize the values of the array
        employees[0] = new Employee("Alice", 50000);
        employees[1] = new Employee("Bob", 51000);
        employees[2] = new Employee("Charlie", 52000);
        employees[3] = new Employee("Dave", 53000);
        employees[4] = new Employee("Ed", 54000);

        // Process the elements of the array
        int sum = employees[0].getSalary() + employees[1].getSalary() + employees[2].getSalary()
            + employees[3].getSalary() + employees[4].getSalary();
        System.out.printf("Sum of salaries = %d\n", sum);

        // Access the info about the second employee
        Employee secondEmployee = employees[1];
        System.out.printf("%s's Salary is %d\n", secondEmployee.getName(), secondEmployee.getSalary());

        // Access the info about the last employee
        Employee lastEmployee = employees[4];
        System.out.printf("%s's Salary is %d\n", lastEmployee.getName(), lastEmployee.getSalary());
    }
}


//Iterating Over Arrays
// Declare an integer array and a string array
int[] salaries = {50000, 51000, 52000, 53000, 54000};
String[] names = {"Alice", "Bob", "Charlie", "Dave", "Ed"};
System.out.printf("Length of salaries array = %d\n", salaries.length);
System.out.printf("Length of names array = %d\n", names.length);

 In the example below, the first for loop prints the names and the corresponding salary information of each employee. 
   The second for loop adds the salaries. The variable index used in the loop is the loop iterator. 
     The variable sum , initialized with the value 0, adds to itself as each element is processed in the array
   
// Loop using the "for" statement
System.out.println("-- Using the for statement");

for (int index = 0; index < salaries.length; index++) {
    String employeeName = names[index];
    int employeeSalary = salaries[index];
    System.out.printf("%s's Salary is %d\n", employeeName, employeeSalary);
}

// Compute the sum of the salaries
int sum = 0;
for (int index = 0; index < salaries.length; index++) {
    sum += salaries[index];
}

// Display results
System.out.printf("Sum of salaries = %d\n", sum);
System.out.printf("Average salary = %d\n", sum / salaries.length);
   
   
//Iterating Over Arrays of Custom Objects
// Loop using the "for" statement
for (int index = 0; index < employees.length; index++) {
    Employee currentEmployee = employees[index];
    String employeeName = currentEmployee.getName();
    int employeeSalary = currentEmployee.getSalary();
    System.out.printf("%s's Salary is %d\n", employeeName, employeeSalary);
}

// Compute the sum of the salaries
int sum = 0;
for (int index = 0; index < employees.length; index++) {
    sum += employees[index].getSalary();
}

System.out.printf("Sum of salaries = %d\n", sum);
System.out.printf("Average salary = %d\n", sum / employees.length);


// Loop using the for-each construct
sum = 0;
for (Employee currentEmployee : employees) {  //each Employee object is now available as the loop is being iterated
    String employeeName = currentEmployee.getName();
    int employeeSalary = currentEmployee.getSalary();

    System.out.printf("%s's Salary is %d\n", employeeName, employeeSalary);
    // Compute the sum of the salaries
    sum += currentEmployee.getSalary();
}

System.out.printf("Sum of salaries = %d\n", sum);
System.out.printf("Average salary = %d\n", sum / employees.length)
  
    
