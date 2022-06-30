package ch.juventus.threads;

public class Printer {
    public synchronized void printCounter() {
        System.out.println("Printer started");
        for (int counter = 10; counter > 0; counter--) {
            System.out.println(counter);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
