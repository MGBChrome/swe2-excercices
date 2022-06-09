package ch.juventus.recursion;

public class FibonacciCalculator {
    private FibonacciCalculator() { }

    public static int fibonacciIterative(int n) {
        int fib = 0;
        int prev = 1;
        for (int i = 0; i < n; i++) {
            int temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }

        public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n-2) + fibonacciRecursive(n-1);
        }
    }
}
