package SynchronizationProb;

public class Subtractor implements Runnable{
    Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 100000; i >= 0; i--) {
            count.value -= 1;
        }
    }
}
