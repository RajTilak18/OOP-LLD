package Threads;

public class Main {
    public static void main(String[] args) {
        helloWorld helloWorld = new helloWorld();
//        helloWorld.run();
        printOnetoN printOnetoN = new printOnetoN();
        for (int i = 10; i >=0; i--){
            printNtoOne printNtoOne = new printNtoOne(i);
            Thread thread = new Thread(printNtoOne);
            thread.start();
        }
    }
}
