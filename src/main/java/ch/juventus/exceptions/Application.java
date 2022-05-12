package ch.juventus.exceptions;

import ch.juventus.object.Address;
import ch.juventus.object.Person;

public class Application {
    public static void main(String[] args) {
        PersonRepository repository = new PersonRepository();
        try {
            repository.findById(42);
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

        Person person = new Person(
                "Hans",
                "Meier",
                new Address("Musterstrasse", 42, 8000, "Zürich"),
                22,
                false
        );

        System.out.println("still alive");

        try {
            repository.AddPerson(person);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("hello?");
    }
}
