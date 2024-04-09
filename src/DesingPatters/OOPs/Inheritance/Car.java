package DesingPatters.OOPs.Inheritance;

public class Car extends Vehicle{
//  We are showcasing runtime polymorphism here.
    @Override
    public void startEngine() {
        System.out.println("This should start the car");
    }
}
