public class Main{
    public static void main(String[] args) {
        Car car1 = new Car("Charlie", "Audi", "A4", "White", 60000.00, 50);
        Car car2 = new Car("David", "BMW", "X5", "Black", 50000.00, 20);

        car1.parking("NYC");    //Charlie's car is currently parked at NYC
        car2.driving();
    }
}