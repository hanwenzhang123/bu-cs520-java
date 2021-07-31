package cs520.hw4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Game<String> {
    //using encapsulation to create instance variables
    private int month;
    private int day;
    private int year;
    private String teamName;
    private String opponentName;
    private ArrayList<Player> players = new ArrayList<Player>();

    public void setDate(int month, int day, int year){  //a convenient way to set date
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void simulateGame() {
        Random random = new Random();
        int teamPoints = 0;     //initially set it 0 and will hold the running total of all points
        int opponentPoints = random.nextInt(100) + 1;   //random integer 1 - 100

        System.out.println("Game played on " + this.month + "/"+ this.day + "/"+ this.year + " vs. " + this.opponentName);

        Iterator<Player> iterator = players.iterator(); //loop through all players (an ArrayList for the Player object)
        while(iterator.hasNext()){
            int points = random.nextInt(10) + 1;    //random integer 1 - 10
            teamPoints += points;    //add points to the teamPoints

            Player playerInfo = iterator.next();  //for what is in toString() method in the Player object
            System.out.println(playerInfo + " scored " +  points + " points");
        }

        System.out.println("Final score: " + teamName + " " + teamPoints + ", "
                            + opponentName + " " + opponentPoints);     //print this line as a score summary
        System.out.println();       //print a blank line
    }

    //Accessors
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public int getYear() {
        return year;
    }
    public String getTeamName() {
        return teamName;
    }
    public String getOpponentName() {
        return opponentName;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }

    //Mutators
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public void setOpponentName(String opponentName) {
        this.opponentName = opponentName;
    }
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
