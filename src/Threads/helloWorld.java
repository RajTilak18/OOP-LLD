package Threads;

public class helloWorld implements Runnable{
    @Override
    public void run() {
        System.out.println("HelloWorld! from " + Thread.currentThread().getName());
    }
}
