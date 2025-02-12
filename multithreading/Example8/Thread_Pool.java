package com.tbc.multithreading.Example8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private final String taskName;

    public WorkerThread(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing " + taskName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished " + taskName);
    }
}

public class Thread_Pool {
    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 6; i++) {
            Runnable worker = new WorkerThread("Task " + i);
            executor.execute(worker); 
        }

        executor.shutdown();
    }
}

