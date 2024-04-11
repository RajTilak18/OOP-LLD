package Threads;

public class printNtoOne implements Runnable{
    private int N;

    public printNtoOne(int N) {
        this.N = N;
    }

    @Override
    public void run() {
        System.out.println(N + " "+ Thread.currentThread().getName());
    }
}
