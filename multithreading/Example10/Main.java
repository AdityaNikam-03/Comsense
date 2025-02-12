package com.tbc.multithreading.Example10;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " is running - Count: " + i);
                Thread.sleep(1000);
                if (i == 2) {
                    Thread.yield();
                    System.out.println(getName() + " yielded execution");
                }
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted");
        }
        System.out.println(getName() + " has finished execution");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getName() + " Priority: " + t1.getPriority());
        System.out.println(t2.getName() + " Priority: " + t2.getPriority());

        t1.start();
        t2.start();

        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());

        Thread daemonThread = new Thread(() -> {
            while (true) {
                try {
                    System.out.println("Daemon thread running...");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Daemon thread interrupted");
                }
            }
        });
        daemonThread.setDaemon(true);
        daemonThread.start();

        t1.interrupt();
        System.out.println(t1.getName() + " interrupted? " + t1.isInterrupted());

        System.out.println("Main thread finished execution");
    }
}

