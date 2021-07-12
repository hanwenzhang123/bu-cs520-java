import java.util.Scanner; 

public class Car{
    private String owner;
    private String brand;
    private String model;
    private String color;
    private double price;
    private int remainingGas = 100;  //default starting point 100

    public Car(String owner, String brand, String model, String color, double price, int gas) {    //constructor
        this.owner = owner;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;

        if(gas >= 0 && gas <= 100) {   //update it only within the range
            this.remainingGas = gas; 
        } else {
            System.out.println("Please enter the range within 0 - 100 in integer");
        }
    }

    public void driving() {
        Scanner scanner = new Scanner(System.in); 

        while(remainingGas>=10){

            System.out.println("Please enter your driving direction (left, right, forward, backward): ");
            String direction = scanner.nextLine(); 

            switch(direction.toLowerCase()) {
                case "left": 
                    remainingGas -= 10;
                    System.out.println("You are driving towards to the left now..." + "\nThe car has a remaining gas: " + remainingGas);
                    break;
                case "right": 
                    remainingGas -= 10;
                    System.out.println("You are driving towards to the right now..." + "\nThe car has a remaining gas: " + remainingGas);
                    break;
                case "forward": 
                    remainingGas -= 10;
                    System.out.println("You are driving forwards now..." + "\nThe car has a remaining gas: " + remainingGas);
                    break;
                case "backward": 
                    remainingGas -= 10;
                    System.out.println("You are driving backwards now..." + "\nThe car has a remaining gas: " + remainingGas);
                    break;
                default:
                    remainingGas -= 10;
                    System.out.println("ERROR! You are driving to nowhere! Please reenter the direction" + "\nThe car has a remaining gas: " + remainingGas);
                    break;
            }
        }

        scanner.close();
    }

    public void parking(String location) {
        System.out.println(this.owner + "'s car is currently parked at " + location);
    }

    //getters
    public String getOwner() {
        return owner;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
    public double getRemainingGas() {
        return remainingGas;
    }
}