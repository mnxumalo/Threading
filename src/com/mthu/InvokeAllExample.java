package com.mthu;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Callable<String> task1 = () -> {
            Thread.sleep(2000);
            return "Result of task 1";
        };

        Callable<String> task2 = () -> {
            Thread.sleep(1000);
            return "Result of task 2";
        };

        Callable<String> task3 = () -> {
            Thread.sleep(5000);
            return "Result of task 3";
        };

        List<Callable<String>> callableList = Arrays.asList(task1, task2, task3);
        List<Future<String>> futures = executorService.invokeAll(callableList);

        for (Future<String> future : futures) {

            //The result is only printed after all the futures are complete
            System.out.println(future.get());
        }
        executorService.shutdown();
    }
}
