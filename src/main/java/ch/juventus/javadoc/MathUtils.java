package ch.juventus.javadoc;

import java.util.List;

/**
 * This is a class full of methods for calculating things
 * @version 1.0
 * @author Roman
 * @since 1.0
 */
public class MathUtils {
    /**
     * Calculates sum of an Iterable of double numbers
     * @param numbers input-list
     * @return sum of List
     * @throws NullPointerException Thrown if the input list is null
     */
    public double addition(Iterable<Double> numbers) {
        double sum = 0;
        for (double item : numbers) {
            sum += item;
        }

        return sum;
    }
    public double subtraction(double a, double b) {
        return a - b;
    }
    public double division(double a, double b) {
        return a / b;
    }
    public double multiplication(double a, double b) {
        return a * b;
    }
}
