package ch.juventus.optional;

import java.util.List;
import java.util.Optional;

public class OptionalApplication {
    public static void main(String[] args) {
        List<String> strings = List.of("a","b","c","d");

        Optional<String> foundResult = strings.stream()
                .filter("b"::equals)
                .findAny();

        Optional<String> notFoundResult = strings.stream()
                .filter("z"::equals)
                .findAny();

        if (foundResult.isPresent()) {
            System.out.println("foundResult is present");
        }
        else {
            System.out.println("foundResult is not present");
        }
        System.out.println("foundResult: " + foundResult.orElse("Not found"));

        if(notFoundResult.isPresent()) {
            System.out.println("notFoundResult is present");
        }
        else {
            System.out.println("notFoundResult is not present");
        }
        System.out.println("notFoundResult: " + notFoundResult.orElse("Not found"));
    }
}
