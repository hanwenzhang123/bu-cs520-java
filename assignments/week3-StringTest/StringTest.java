/**
 * StringTest.java (Assignment 3, Part 1)
 * @author Hanwen Zhang
 */

package hw3.part1;

import java.util.Scanner;

public class StringTest {

        public static void main(String[] args) {

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter name,age,city: ");
                String input = scanner.nextLine();  // read input into a String variable when Enter is pressed
                String trimInput = input.trim();    // replace the value of input with the trimmed version to trimInput

                //name
                int index1 = trimInput.indexOf(',');    //find the position of the first comma in input
                String name = trimInput.substring(0, index1);   //extract the name part of the input
                System.out.printf("Name: %s (length: %d) \n", name, name.length());

                //age
                int index2 = trimInput.indexOf(',', index1 + 1);    //the position of the second comma
                String ageString = trimInput.substring(index1 + 1, index2); //extract the age part of input
                int age = Integer.parseInt(ageString);  //convert ageString to an int
                System.out.printf("Age: %d \nAge in 10 years: %d \n", age, age + 10);   //print the age and what the age will be 10 years from now

                //city
                String city = trimInput.substring(index2 + 1);  //extract the city
                System.out.printf("City: %s (length: %d) \n", city, city.length());

            } catch (Exception e) { //this statement will printout only if exception occurs
                System.out.println("Sorry, but an error has occurred. Please check your input and try again.");
            }
        }
    }
/* Output:
    Please enter name,age,city:
    John,25,Boston

     Name: John (length: 4)
     Age: 25
     Age in 10 years: 35
     City: Boston (length: 6)
 */