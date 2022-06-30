package ch.juventus.threads;

public class ThreadInfoExample {
    public static void main(String[] args) throws InterruptedException {
        Runnable threadInfoRunnable = new ThreadInfo();
        Thread thread1 = new Thread(threadInfoRunnable);
        Thread thread2 = new Thread(threadInfoRunnable);

        printThreadState("thread1-state before started: ", thread1);
        printThreadState("thread2-state before started: ", thread2);

        thread1.start();
        thread2.start();

        printThreadState("thread1-state after started: ", thread1);
        printThreadState("thread2-state after started: ", thread2);

        System.out.println("Wait for one second");
        Thread.sleep(1000);

        printThreadState("thread1-state after sleeping: ", thread1);
        printThreadState("thread2-state after sleeping: ", thread2);
    }

    private static void printThreadState(String message, Thread thread) {
        System.out.println(message + thread.getState());
    }
}
