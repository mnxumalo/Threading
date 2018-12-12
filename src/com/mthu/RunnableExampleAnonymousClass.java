package com.mthu;

class RunnableExampleAnonymousClass {

    public static void main(String[] args){
        System.out.println("Inside " + Thread.currentThread().getName());

        System.out.println("Creating a Runnable...");

        Runnable runnable = () -> System.out.println("Inside " + Thread.currentThread().getName());

        System.out.println("Creating a Thread");

        Thread thread = new Thread(runnable);
        thread.setName("RunnableExampleAnonymousThread");
        System.out.println("Starting a Thread");
        thread.start();
    }
}
