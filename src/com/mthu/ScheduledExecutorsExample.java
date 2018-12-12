package com.mthu;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledExecutorsExample {

    public static void main(String[] args){

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        Runnable runnable = () -> System.out.println("Executing task at " + System.nanoTime());

        System.out.println("Submitting task at " + System.nanoTime() + " to be executed after 5 seconds");
        scheduledExecutorService.schedule(runnable, 5, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}
