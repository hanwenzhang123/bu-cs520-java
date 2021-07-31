/**
 This is a placeholder file. Copy Player.java from Assignment 3 and overwrite this file.
 Make the following changes to it before you begin work on the assignment:
  - Change its package statement to match the current package (cs520.hw4)
  - Remove the computeScoringAverage() method
  - Remove any import statements that are no longer needed (optional)
*/

package cs520.hw4;

public class Player {
    private int number;
    private String name;
    private String position;
    private String year;

    public Player(String name) {    //single constructor - name
        this.name = name;
    }

    public String toString() {      //return the string representation of an object instance
        return "#" + this.number + ": " + this.name + " (" + this.position + ", " + this.year + ")";
    }

    //Getters for each variable
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public String getYear() {
        return year;
    }

    //Setters for each variable
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setYear(String year) {
        this.year = year;
    }
}
