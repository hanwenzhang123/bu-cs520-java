import java.util.Scanner; 
import java.time.LocalDateTime; 

public class Age{    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt(); 

        scanner.nextLine();

        System.out.println("Enter your month of birth:");
        int monthOfBirth = scanner.nextInt(); 

        scanner.nextLine();

        System.out.println("Enter your date of birth:");
        int dateOfBirth = scanner.nextInt(); 

        scanner.nextLine();

        System.out.println("Enter your name:");
        String name = scanner.nextLine(); 

        age(name, yearOfBirth);
        
        scanner.close();

    }

    public static void age(String name, int yearOfBirth){
        LocalDateTime year = LocalDateTime.getYears();  
        int age = (int) year - yearOfBirth;
        int daysOfLife = age * 365;
        System.out.println("Your name is " + name + ", and you are " + age + " years old.\n" + 
                            "You have lived in the world for over " + daysOfLife + " days."); 
    }

}

