package Synchronized;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Count count;

    public Adder(Count count) {

        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100000; i++) {
            synchronized (count) {
                count.value += 1;
            }
        }
    }
}
