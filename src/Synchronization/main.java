package Synchronization;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread thread = new Thread(adder);
        Thread thread1 = new Thread(subtractor);

        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println(count.value);
    }

}
