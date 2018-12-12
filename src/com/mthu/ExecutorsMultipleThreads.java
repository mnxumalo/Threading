package com.mthu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ExecutorsMultipleThreads {

    public static void main(String[] args){
        System.out.println("Inside " + Thread.currentThread().getName());

        System.out.println("Creating executor service with a thread pool of size 2");
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            System.out.println("Executing Task1 inside " + Thread.currentThread().getName());

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        };

        Runnable task2 = () -> {
            System.out.println("Executing Task2 inside " + Thread.currentThread().getName());

            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        };

        Runnable task3 = () -> {
            System.out.println("Executing Task3 inside " + Thread.currentThread().getName());

            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        };

        System.out.println("Submitting tasks for execution");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        executorService.shutdown();
    }
}
