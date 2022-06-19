package ch.juventus.lambda;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExamples {
    public static void main(String[] args) {
        functionTypeExercise();
        System.out.println();
        functionalInterfaceExercise();
        System.out.println();
        numberListsExercise();
        System.out.println();
        peopleExercise();
    }

    private static void functionTypeExercise() {
        Function<Date, String> generateDateText = date -> "Jetzt ist " + date;
        String dateText = generateDateText.apply(new Date());
        System.out.println(dateText);
    }

    private static void functionalInterfaceExercise() {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        int resultAddition = operate(20, 10, addition);
        System.out.println("addition: " + resultAddition);

        int resultSubtraction = operate(25, 15, subtraction);
        System.out.println("subtraction: " + resultSubtraction);

        int resultMultiplication = operate(30, 5, multiplication);
        System.out.println("multiplication: " + resultMultiplication);

        int resultDivision = operate(40, 4, division);
        System.out.println("division: " + resultDivision);
    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }

    private static void numberListsExercise() {
        List<List<Integer>> numberLists = List.of(
                List.of(1, 2, 3),
                List.of(2, 3, 4),
                List.of(3, 4, 5),
                List.of(4, 5, 6)
        );

        List<Integer> processedList = numberLists.stream()
                .flatMap(Collection::stream)
                .map(number -> number * 2)
                .distinct()
                .sorted()
                .collect(Collectors.toList()); // toList() ab Java 16

        System.out.println("processedList:");
        System.out.println(processedList);
    }

    private static void peopleExercise() {
        List<Person> people = List.of(
                new Person("Bernd", 20),
                new Person("Fritz", 25),
                new Person("Boris", 15),
                new Person("Anna", 15)
        );

        boolean allOver18 = people.stream()
                .filter(person -> !person.getName().startsWith("A"))
                .map(Person::getAlter)
                .allMatch(alter -> alter >= 18);

        System.out.println("All are over 18: " + allOver18);
    }


}
