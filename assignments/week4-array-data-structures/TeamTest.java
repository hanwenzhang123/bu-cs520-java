/**
 This is a placeholder file. Copy TeamTest.java from Assignment 3 and overwrite this file.
 Change its package statement to match the current package (cs520.hw4).
 */

package cs520.hw4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TeamTest {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            File file = new File("src/cs520/hw4/team.txt");
            scanner = new Scanner(file);

            ArrayList<Player> players = new ArrayList<Player>();    //will contain Player objects
            String[] opponents = new String[] {"Boston College", "Northeastern", "Harvard", "MIT", "UMass"};

            while (scanner.hasNextLine()) {     //loops while hasNextLine() returns true
                String number = scanner.nextLine();
                String name = scanner.nextLine();
                String position = scanner.nextLine();
                String year = scanner.nextLine();
                scanner.nextLine();   //just scan the fifth line, the "-----" in txt file, not doing anything

                Player eachPlayer = createPlayer(number, name, position, year); //return each new instance in the Player
                players.add(eachPlayer);    //add each player to the players ArrayList
            }

            for( String opponent : opponents) {     //for each opponent in the opponents
                Game game = new Game(); // create a new instance of Game
                game.setTeamName("Boston University");
                game.setOpponentName(opponent);
                game.setDate(7, 31, 2021);
                game.setPlayers(players);   //passing in the ArrayList
                game.simulateGame();    //this will produce the output in that method
            }

        } catch (Exception e) {   //catch all exceptions, and print the message if caught
            System.out.println("Something went wrong, please check!");
        } finally {     //close the scanner
            scanner.close();
        }
    }

    static Player createPlayer(String number, String name, String position, String year) {

        int numberInt=Integer.parseInt(number); //Converts String number to an int

        Player player = new Player(name);   //passing name value by using Player's String constructor

        player.setNumber(numberInt);    //set number using its mutator methods
        player.setPosition(position);   //set position using its mutator methods
        player.setYear(year);   //set year using its mutator methods

        return player;      //return the new player as the instance in the Player object
    }
}

/* Output from the console:

Game played on 7/31/2021 vs. Boston College
#1: Alan Alex (Goalkeeper, Senior) scored 7 points
#2: Bryan Bob (Right Fullback, Junior) scored 9 points
#3: Charles Clark (Left Fullback, Senior) scored 6 points
#4: David Davis (Center Back, Sophomore) scored 7 points
#5: Edison Elvis (Defending, Freshman) scored 6 points
#6: Frank Faith (Right Midfielder, Junior) scored 8 points
#7: George Gerald (Central, Freshman) scored 5 points
#8: Henry Harry (Striker, Junior) scored 2 points
#9: Jason John (Attacking Midfielder, Senior) scored 5 points
#10: Kevin Kyle (Left Midfielder, Senior) scored 6 points
Final score: Boston University 61, Boston College 12

Game played on 7/31/2021 vs. Northeastern
#1: Alan Alex (Goalkeeper, Senior) scored 9 points
#2: Bryan Bob (Right Fullback, Junior) scored 7 points
#3: Charles Clark (Left Fullback, Senior) scored 9 points
#4: David Davis (Center Back, Sophomore) scored 10 points
#5: Edison Elvis (Defending, Freshman) scored 7 points
#6: Frank Faith (Right Midfielder, Junior) scored 2 points
#7: George Gerald (Central, Freshman) scored 10 points
#8: Henry Harry (Striker, Junior) scored 3 points
#9: Jason John (Attacking Midfielder, Senior) scored 9 points
#10: Kevin Kyle (Left Midfielder, Senior) scored 1 points
Final score: Boston University 67, Northeastern 95

Game played on 7/31/2021 vs. Harvard
#1: Alan Alex (Goalkeeper, Senior) scored 9 points
#2: Bryan Bob (Right Fullback, Junior) scored 5 points
#3: Charles Clark (Left Fullback, Senior) scored 9 points
#4: David Davis (Center Back, Sophomore) scored 8 points
#5: Edison Elvis (Defending, Freshman) scored 10 points
#6: Frank Faith (Right Midfielder, Junior) scored 6 points
#7: George Gerald (Central, Freshman) scored 7 points
#8: Henry Harry (Striker, Junior) scored 1 points
#9: Jason John (Attacking Midfielder, Senior) scored 9 points
#10: Kevin Kyle (Left Midfielder, Senior) scored 7 points
Final score: Boston University 71, Harvard 22

Game played on 7/31/2021 vs. MIT
#1: Alan Alex (Goalkeeper, Senior) scored 4 points
#2: Bryan Bob (Right Fullback, Junior) scored 9 points
#3: Charles Clark (Left Fullback, Senior) scored 7 points
#4: David Davis (Center Back, Sophomore) scored 8 points
#5: Edison Elvis (Defending, Freshman) scored 6 points
#6: Frank Faith (Right Midfielder, Junior) scored 6 points
#7: George Gerald (Central, Freshman) scored 5 points
#8: Henry Harry (Striker, Junior) scored 6 points
#9: Jason John (Attacking Midfielder, Senior) scored 4 points
#10: Kevin Kyle (Left Midfielder, Senior) scored 3 points
Final score: Boston University 58, MIT 49

Game played on 7/31/2021 vs. UMass
#1: Alan Alex (Goalkeeper, Senior) scored 10 points
#2: Bryan Bob (Right Fullback, Junior) scored 9 points
#3: Charles Clark (Left Fullback, Senior) scored 8 points
#4: David Davis (Center Back, Sophomore) scored 3 points
#5: Edison Elvis (Defending, Freshman) scored 4 points
#6: Frank Faith (Right Midfielder, Junior) scored 10 points
#7: George Gerald (Central, Freshman) scored 6 points
#8: Henry Harry (Striker, Junior) scored 4 points
#9: Jason John (Attacking Midfielder, Senior) scored 3 points
#10: Kevin Kyle (Left Midfielder, Senior) scored 9 points
Final score: Boston University 66, UMass 22
 */