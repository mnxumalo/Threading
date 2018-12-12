package com.mthu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorsExample {

    public static void main(String[] args){
        System.out.println("Inside " + Thread.currentThread().getName());

        System.out.println("Creating executor service");
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        System.out.println("Creating a Runnable");

        Runnable runnable = () -> System.out.println("Inside " + Thread.currentThread().getName());

        System.out.println("Submit the task specified by the Runnable to the executor service");

        executorService.submit(runnable);

        System.out.println("Shutting down the executor");
        executorService.shutdown();
    }
}
