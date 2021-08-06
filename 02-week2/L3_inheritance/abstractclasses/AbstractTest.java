package cs520.module2.L3_inheritance.abstractclasses;

public class AbstractTest {
 
    public static void main(String[] args) {
    
        // Abstract classes cannot be instantiated
        //Person p = new Student();

        // Use a constant from an abstract class
        double creditsPerSemester = 5.0 * Constants.CREDITS_PER_COURSE;
        System.out.println(creditsPerSemester);

    }

}