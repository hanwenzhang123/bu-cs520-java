import java.util.Scanner;

public class ScannerTest {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("What is your name? ");
    String name = scanner.nextLine();   //input as string
//  int name = scanner.nextInt();   //input as int
    System.out.println("Hello, " + name);
    System.out.printf("Hello, %s", name);  //printf is for formatted print, using ',' instead of '+'
  }
}

%s - string
%d - digit
