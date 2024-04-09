package DesingPatters.OOPs.Inheritance;

public class user {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.startEngine();
        Car car = new Car();
        car.startEngine();
        Vehicle vehicle1 = new Car();
        vehicle1.startEngine();
    }
}
