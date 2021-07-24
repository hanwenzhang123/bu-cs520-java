/**
 * Player.java (Assignment 3, Part 2)
 * @author Hanwen Zhang
 */

package hw3.part2;

import java.util.Random;

public class Player {

    private int number;
    private String name;
    private String position;
    private String year;

    public Player(String name) {    //single constructor - name
        this.name = name;
    }

    public double computeScoringAverage(){  //returns a random double value
        Random random = new Random();   //using the package Random
        double r = random.nextDouble();     //for double value greater or equal to 0.0 but less than 10.0
        double value = 10.0 * r;    // a random double value between 0.0 and 10.0.
        return value;
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
