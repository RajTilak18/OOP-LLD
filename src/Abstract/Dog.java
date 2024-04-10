package Abstract;

public class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("Dog can run");
    }

    @Override
    public void drink() {
        System.out.println("Dog can drink water");
    }

    @Override
    public void pairOfEyes() {
        super.pairOfEyes();
    }
}
