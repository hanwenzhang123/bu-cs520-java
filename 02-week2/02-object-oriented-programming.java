//Overloading
Java provides a mechanism, known as method overloading, that allows using the same method name for different operations.
  
The different variations of the overloaded method are shown below.
  
   public double getCurrentSalary() {
     double result = startingSalary + startingSalary * 0.04 * timeEmployed;
     return result;
}
   public double getCurrentSalary(double raise) {
     double result = startingSalary + startingSalary * raise * timeEmployed;
     return result;
}
   public double getCurrentSalary(int percentRaise) {
     double result = startingSalary + startingSalary * percentRaise *
       timeEmployed / 100;
     return result;
}
  
A sample program using the above code is shown below.
  
   public class P02_EmployeeTest {
     public static void main(String[] args) {
       P02_Employee e = null;
       // Create an employee
       for (int i = 1; i <= 10; i++) {
         e = new P02_Employee("Bob" + i, 60000, 2);
         for (int raise = 2; raise <= 8; raise += 2) {
           System.out.printf("%s's salary @ %d%% raise = $%.2f\n",
             e.getName(), raise, e.getCurrentSalary(raise));
         }
         for (double raise = 0.02; raise <= .08; raise += 0.02) {
           System.out.printf("%s's salary @ %.2f raise = $%.2f\n",
             e.getName(), raise, e.getCurrentSalary(raise));
         }
       }
     }
   }

//Method Signatures
This is known as the method signature, and is the basis for differentiating between overloaded methods that have the same name.
   Syntax: Signature
   method_name(type_of_parameter_1,type_of_parameter_2,...)
     
In short, an overloaded method must change the argument list, either the number of the arguments, or the types of at least one argument. 
     Return type and access modifier does not matter.
   
