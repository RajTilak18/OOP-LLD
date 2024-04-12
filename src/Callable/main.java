package Callable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> listToBeSorted = List.of(67,23,34,56,78,1,4,5);
        ExecutorService executorService = Executors.newCachedThreadPool();

        mergeSorter mergeSorter = new mergeSorter(listToBeSorted, executorService);
        Future<List<Integer>> futureList = executorService.submit(mergeSorter);
        List<Integer> list = futureList.get();
        System.out.println(list);

    }
}
