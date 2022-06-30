package ch.juventus.threads;

public class ThreadInfo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread-name: " + Thread.currentThread().getName());
    }
}
