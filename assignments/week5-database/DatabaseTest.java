package cs520.hw5;

import java.io.File;
import java.sql.SQLException;
import java.util.*;

public class DatabaseTest {

	// Copy main() and createPlayer() from TeamTest (Assignment 4) here and
	// make the modifications listed in the Assignment 5 document.

    public static void main(String[] args) throws DatabaseException {
        Scanner scanner = null;

        try {
            File file = new File("src/cs520/hw5/team.txt");
            scanner = new Scanner(file);

            //Here we use LinkedHashSet as the Data Structure for player
            //LinkedHashSet is ordered by sequence, no duplicates, elements iterate and will maintain insertion order
            //Contrast to HashSet: HashSet is an unordered and unsorted, and does not maintain the insertion order
            //Contrast to ArrayList: ArrayList allows duplicates whereas LinkedHashSet only store unique values
            Collection<Player> players = new LinkedHashSet<>();

            while (scanner.hasNextLine()) {
                String number = scanner.nextLine();
                String name = scanner.nextLine();
                String position = scanner.nextLine();
                String year = scanner.nextLine();
                scanner.nextLine();

                Player eachPlayer = createPlayer(number, name, position, year);
                players.add(eachPlayer);
            }

            Database.insertPlayers(players);

            Map<String, Player> selectedPlayers =  Database.selectPlayers();

            Iterator<String> it = selectedPlayers.keySet().iterator();
            while(it.hasNext()) {
                String key = it.next();
                System.out.println(key + ": " + selectedPlayers.get(key));
            }

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            throw new DatabaseException();
        } finally {
            scanner.close();
        }
    }

    static Player createPlayer(String number, String name, String position, String year) throws SQLException {

        int numberInt=Integer.parseInt(number);

        Player player = new Player(name);
        player.setNumber(numberInt);
        player.setPosition(position);
        player.setYear(year);

        return player;      //return the player as the instance in the Player object
    }
}

/* Output from the console:

Inserting player into database: #1: Alan Alex (Goalkeeper, Senior)
Inserting player into database: #2: Bryan Bob (Right Fullback, Junior)
Inserting player into database: #3: Charles Clark (Left Fullback, Senior)
Inserting player into database: #4: David Davis (Center Back, Sophomore)
Inserting player into database: #5: Edison Elvis (Defending, Freshman)
Inserting player into database: #6: Frank Faith (Right Midfielder, Junior)
Inserting player into database: #7: George Gerald (Central, Freshman)
Inserting player into database: #8: Henry Harry (Striker, Junior)
Inserting player into database: #9: Jason John (Attacking Midfielder, Senior)
Inserting player into database: #10: Kevin Kyle (Left Midfielder, Senior)
Henry Harry: #8: Henry Harry (Striker, Junior)
Alan Alex: #1: Alan Alex (Goalkeeper, Senior)
Charles Clark: #3: Charles Clark (Left Fullback, Senior)
David Davis: #4: David Davis (Center Back, Sophomore)
George Gerald: #7: George Gerald (Central, Freshman)
Bryan Bob: #2: Bryan Bob (Right Fullback, Junior)
Joe Smith: #20: Joe Smith (PG, Senior)
Frank Faith: #6: Frank Faith (Right Midfielder, Junior)
Jason John: #9: Jason John (Attacking Midfielder, Senior)
Kevin Kyle: #10: Kevin Kyle (Left Midfielder, Senior)
Edison Elvis: #5: Edison Elvis (Defending, Freshman)

 */