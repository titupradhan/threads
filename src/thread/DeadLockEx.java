package thread;

import java.util.concurrent.TimeUnit;

public class DeadLockEx {

    public static void main(String[] args) {

        final Object lock1 = new Object();
        final Object lock2 = new Object();


        Runnable r1 = () -> {
            synchronized (lock1) {
                System.out.println("Inside lock1 " + Thread.currentThread().getName());
                sleep(1);
                synchronized (lock2) {
                    System.out.println("Inside lock2 " + Thread.currentThread().getName());
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (lock2) {
                System.out.println("Inside lock2 " + Thread.currentThread().getName());
                sleep(1);
                synchronized (lock1) {
                    System.out.println("Inside lock1 " + Thread.currentThread().getName());
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

        System.out.println("End of main");

    }

    private static void sleep(long seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
