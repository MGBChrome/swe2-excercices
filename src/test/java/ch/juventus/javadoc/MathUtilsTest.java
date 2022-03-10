package ch.juventus.javadoc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    private MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @Test
    void shouldSumWhenAddingSimpleList() {
        // given
        Iterable<Double> input = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);

        // when
        double result = mathUtils.addition(input);

        // then
        assertEquals(15, result, "Invalid result");
    }

    @Test
    void shouldReturnZeroWhenAddingEmptyList() {
        // given
        Iterable<Double> input = new ArrayList<>();

        // when
        double result = mathUtils.addition(input);

        // then
        assertEquals(0, result, "Invalid result");
    }

    @Test
    void shouldThrowExceptionWhenAddingNullList() {
        // when
        // then
        Exception exception = assertThrows(
                NullPointerException.class,
                () -> mathUtils.addition(null)
        );
    }

    @Test
    void shouldThrowExceptionWhenAddingListWithNulls() {
        // given
        List<Double> input = Arrays.asList(1.0, null, 3.0, 4.0, null);

        // when
        // then
        Exception exception = assertThrows(
                NullPointerException.class,
                () -> mathUtils.addition(input)
        );
    }


    @Test
    void shouldSubtractWhenSubtractionCalled() {
        // when
        double result = mathUtils.subtraction(7, 9);

        // then
        assertEquals(-2, result, "Invalid result");
    }

    @Test
    void shouldDivideWhenDivisionCalled() {
        // when
        double result = mathUtils.division(-3, 2);

        // then
        assertEquals(-1.5, result, "Invalid result");
    }

    @Test
    void shouldReturnInfinityWhenDividingByZero() {
        // when
        Double result = mathUtils.division(15, 0);

        // then
        assertEquals(Double.POSITIVE_INFINITY, result, "Invalid result");
    }

    @Test
    void shouldReturnMinus6WhenMultiplicationCalled() {
        // when
        double result = mathUtils.multiplication(-3, 2);

        // then
        assertEquals(-6, result, "Invalid result");
    }
}