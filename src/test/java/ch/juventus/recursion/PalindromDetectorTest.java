package ch.juventus.recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromDetectorTest {
    @ParameterizedTest
    @ValueSource(strings = {"Anna", "Bob", "Level", "Anna Bob Anna", "!+Level+!"})
    void TestIsPalindromIterativeTrue(String input)
    {
        boolean result = PalindromDetector.isPalindromIterative(input);
        assertTrue(result, "Wrong detection");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Korb", "Mein Computer", "Fuss", "Kamel und Stein"})
    void TestIsPalindromIterativeFalse(String input)
    {
        boolean result = PalindromDetector.isPalindromIterative(input);
        assertFalse(result, "Wrong detection");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anna", "Bob", "Level", "Anna Bob Anna", "!+Level+!"})
    void TestIsPalindromRecursiveTrue(String input)
    {
        boolean result = PalindromDetector.isPalindromRecursive(input);
        assertTrue(result, "Wrong detection");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Korb", "Mein Computer", "Fuss", "Kamel und Stein"})
    void TestIsPalindromRecursiveFalse(String input)
    {
        boolean result = PalindromDetector.isPalindromRecursive(input);
        assertFalse(result, "Wrong detection");
    }
}