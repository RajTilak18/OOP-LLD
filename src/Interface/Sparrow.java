package Interface;

public class Sparrow implements Bird{
    @Override
    public void fly() {
        System.out.println("Sparrow can fly");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow can eat");
    }
}
