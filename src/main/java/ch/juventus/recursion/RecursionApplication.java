package ch.juventus.recursion;

public class RecursionApplication {
    private static final int STELLE = 45;

    public static void main(String[] args) {
        evaluateIteration(STELLE);
        evaluateRecursion(STELLE);
    }

    private static void evaluateIteration(int stelle) {
        long nowInMillis = System.currentTimeMillis();
        int resultIterative = FibonacciCalculator.fibonacciIterative(stelle);
        long durationInMillis = System.currentTimeMillis() - nowInMillis;
        System.out.println("resultIterative: " + resultIterative);
        System.out.println("durationInMillis after iteration: " + durationInMillis);
    }

    private static void evaluateRecursion(int stelle) {
        long nowInMillis;
        long durationInMillis;
        nowInMillis = System.currentTimeMillis();
        int resultRecursive = FibonacciCalculator.fibonacciRecursive(stelle);
        durationInMillis = System.currentTimeMillis() - nowInMillis;
        System.out.println("resultRecursive: " + resultRecursive);
        System.out.println("durationInMillis after recursion: " + durationInMillis);
    }
}
