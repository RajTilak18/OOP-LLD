package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        helloWorld helloWorld = new helloWorld();
////        helloWorld.run();
//        printOnetoN printOnetoN = new printOnetoN();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 10; i >=0; i--){
//            printNtoOne printNtoOne = new printNtoOne(i);
//            Thread thread = new Thread(printNtoOne);
//            thread.start();
            executorServ executorServ = new executorServ(i);
            executorService.submit(executorServ);
        }
    }
}
