package com.sda.singleton;

public class Application {
    public static void main(String[] args) {
        Thread cosummerThread1 = new Thread(new Consumer());
        Thread cosummerThread2 = new Thread(new Consumer());
        Thread producerThread = new Thread(new Producer());
        Thread producerThread2 = new Thread(new Producer());

        producerThread.start();
        producerThread2.start();
        cosummerThread1.start();
        cosummerThread2.start();
    }
}
