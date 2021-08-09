package cs520.hw5;

// Overwrite this file with your Player.java file from Assignment 4
// and make the changes indicated in the Assignment 5 document.

public class Player {
    private int number;
    private String name;
    private String position;
    private String year;

    public Player() {    //no args empty constructor
        super();
    }

    public Player(String name) {
        this.name = name;
    }

    public String toString() {   //return the string representation of an object instance
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
