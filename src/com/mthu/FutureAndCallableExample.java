package com.mthu;

import java.util.concurrent.*;

public class FutureAndCallableExample {

    public static void main(String[] args){

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> callable = () -> {
            System.out.println("Entered Callable");
            Thread.sleep(2000);
            return "Hello from Callable";
        };

        System.out.println("Submitting Callable");
        Future<String> future = executorService.submit(callable);

        while (!future.isDone()){
            System.out.println("Task is not done");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //future.get() blocks until the result is available
        String result = "";
        try {
            result = future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(result);
        executorService.shutdown();
    }
}
