package ch.juventus.recursion;

import java.util.Locale;

public class PalindromDetector {
    private PalindromDetector() { }

    public static boolean isPalindromIterative(String input) {
        String lowerCaseInput = input.toLowerCase(Locale.ROOT);
        for (int i = 0; i < lowerCaseInput.length() / 2; i++) {
            char fromStart = lowerCaseInput.charAt(i);
            System.out.println(fromStart);
            char fromEnd = lowerCaseInput.charAt(input.length() - (i + 1));
            System.out.println(fromEnd);

            if (fromStart != fromEnd)
                return false;
        }

        return true;
    }

    public static boolean isPalindromRecursive(String input) {
        if (input.length() <= 1)
            return true;

        String fromStart = input.substring(0, 1);
        int endIndex = input.length();
        int secondFromEndIndex = endIndex - 1;
        String fromEnd = input.substring(secondFromEndIndex, endIndex);

        if (!fromStart.equalsIgnoreCase(fromEnd))
            return false;

        return isPalindromRecursive(input.substring(1, secondFromEndIndex));
    }
}
