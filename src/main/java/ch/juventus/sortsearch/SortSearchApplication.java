package ch.juventus.sortsearch;

import ch.juventus.xml.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SortSearchApplication {

    public static final String SEARCH_PHONE_NUMBER = "0413205678";

    public static void main(String[] args) {
        sort();
        search();
    }

    private static void sort() {
        List<Person> people = Arrays.asList(
                new Person("Hans", "Muster"),
                new Person("Peter", "Keller"),
                new Person("Peter", "Kuster"),
                new Person("Lisa", "Muster")
        );

        System.out.println("Before sorting:");
        people.forEach(System.out::println);

        people.sort(new CompareByFirstAndLastName());

        System.out.println("After sorting:");
        people.forEach(System.out::println);
    }

    private static void search() {
        Map<Person, String> people = Map.of(
                new Person("Hans", "Muster"), "0417602211",
                new Person("Peter", "Keller"), SEARCH_PHONE_NUMBER,
                new Person("Peter", "Kuster"), "04168012134",
                new Person("Lisa", "Muster"), "0417601234"
        );

        Person searchResult = PersonSearcherByPhoneNumber.findFirstOrDefault(people, SEARCH_PHONE_NUMBER);
        System.out.println("Search result:");
        System.out.println(searchResult);

        Person searchResultNull = PersonSearcherByPhoneNumber.findFirstOrDefault(people, "123");
        System.out.println("null result:");
        System.out.println(searchResultNull);
    }
}
