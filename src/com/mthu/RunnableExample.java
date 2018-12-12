package com.mthu;

class RunnableExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside " + Thread.currentThread().getName());
    }
}
