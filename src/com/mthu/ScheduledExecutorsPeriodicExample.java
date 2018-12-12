package com.mthu;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledExecutorsPeriodicExample {

    public static void main(String[] args){

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        Runnable task = () -> System.out.println("Executing Task at " + System.nanoTime());

        System.out.println("Scheduling a task to be executed every 2 seconds with initial delay of 0 seconds");
        scheduledExecutorService.scheduleWithFixedDelay(task, 0,2, TimeUnit.SECONDS);
    }
}
