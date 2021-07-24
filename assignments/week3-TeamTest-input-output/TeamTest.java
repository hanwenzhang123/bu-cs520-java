/**
 * TeamTest.java (Assignment 3, Part 2)
 * @author Hanwen Zhang
 */

package hw3.part2;

import java.io.File;
import java.util.Scanner;

public class TeamTest {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {            
            File file = new File("src/hw3/part2/team.txt");
            scanner = new Scanner(file);
            double totalScoringAverage = 0.0;   //initialize with a value 0.0, but will add up for each loop

            while (scanner.hasNextLine()) {     //loops while hasNextLine() returns true
                String number = scanner.nextLine();
                String name = scanner.nextLine();
                String position = scanner.nextLine();
                String year = scanner.nextLine();
                scanner.nextLine();   //just scan the fifth line, the "-----" in txt file, not doing anything

                totalScoringAverage += createPlayer(number, name, position, year);   //add the return double value to the variable totalScoringAverage
            }

            System.out.println("Average score: " + totalScoringAverage/10);

        } catch (Exception e) {   //catch all exceptions, and print the message if caught
            System.out.println("Something went wrong, please check!");
        } finally {     //close the scanner
            scanner.close();
        }
    }

    static double createPlayer(String number, String name, String position, String year) {

        int numberInt=Integer.parseInt(number); //Converts String number to an int

        Player player = new Player(name);   //passing name value by using Player's String constructor

        player.setNumber(numberInt);    //set number using its mutator methods
        player.setPosition(position);   //set position using its mutator methods
        player.setYear(year);   //set year using its mutator methods

        double average = player.computeScoringAverage();    //call the player instance's method

        System.out.println(player.toString()+": "+average); //print player's info

        return average; //return the average value
    }
}
/* output:
#1: Alan Alex (Goalkeeper, Senior): 9.844311684821948
#2: Bryan Bob (Right Fullback, Junior): 5.672563472366077
#3: Charles Clark (Left Fullback, Senior): 7.872193157280449
#4: David Davis (Center Back, Sophomore): 9.309806198000944
#5: Edison Elvis (Defending, Freshman): 9.81611816468081
#6: Frank Faith (Right Midfielder, Junior): 9.255517170362841
#7: George Gerald (Central, Freshman): 1.9824888163088594
#8: Henry Harry (Striker, Junior): 6.848399194599908
#9: Jason John (Attacking Midfielder, Senior): 4.815538048436935
#10: Kevin Kyle (Left Midfielder, Senior): 4.671212143856032
Average score: 7.008814805071481
*/
