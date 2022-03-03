package ch.juventus.javadoc;

import java.util.ArrayList;
import java.util.List;

public class JavadocApp {
    public static void main(String[] args) {
        MathUtils utils = new MathUtils();

        double number1 = 3;
        double number2 = 7;

        Double[] numbers = new Double[] {1.0, 2.0, 3.0, 4.0, 5.0};
        List<Double> inputs = List.of(numbers);

        double result = utils.addition(inputs);
        System.out.println(result);

        result = utils.subtraction(number1, number2);
        System.out.println(result);

        result = utils.multiplication(number1, number2);
        System.out.println(result);

        result = utils.division(number1, number2);
        System.out.println(result);
    }
}
