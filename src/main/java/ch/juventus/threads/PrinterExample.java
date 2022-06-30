package ch.juventus.threads;

public class PrinterExample {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Runnable printerJob = new PrinterJob(printer);

        Thread thread1 = new Thread(printerJob);
        Thread thread2 = new Thread(printerJob);

        thread1.start();
        thread2.start();
    }
}
