package Threads;

public class executorServ implements Runnable{
    private int N;

    public executorServ(int N) {
        this.N = N;
    }

    @Override
    public void run() {
        System.out.println(N + " "+ Thread.currentThread().getName());
    }
}
