package com.mthu;

class Main {

    public static void main(String[] args) {

        System.out.println("Inside " + Thread.currentThread().getName());

        System.out.println("Creating a Thread...");

        Thread thread = new ThreadExample();
        thread.setName("Thread Example");
        System.out.println("Starting a Thread...");
        thread.start();

        System.out.println("Creating a Runnable...");
        Runnable runnable = new RunnableExample();

        System.out.println("Creating a Thread..");
        Thread runnableThread = new Thread(runnable);
        runnableThread.setName("Runnable Thread");

        System.out.println("Starting a Thread...");
        runnableThread.start();
    }
}
