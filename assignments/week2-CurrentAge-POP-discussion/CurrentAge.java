import java.util.Scanner; 

public class CurrentAge{    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt(); 

        scanner.nextLine();

        System.out.println("Enter your name:");
        String name = scanner.nextLine(); 

        calculateAge(name, yearOfBirth);
        
        scanner.close();

    }

    public static void calculateAge(String name, int yearOfBirth){
        int age = 2021 - yearOfBirth;
        int daysOfLife = age * 365;
        System.out.println("Your name is " + name + ", and you are " + age + " years old.\n" + 
                            "You have lived in the world for over " + daysOfLife + " days."); 
    }

}

