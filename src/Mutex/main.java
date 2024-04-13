package Mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();

        Adder adder = new Adder(count, lock);
        Subtractor subtractor = new Subtractor(count, lock);

        Thread thread = new Thread(adder);
        Thread thread1 = new Thread(subtractor);

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println(count.value);
    }

}
