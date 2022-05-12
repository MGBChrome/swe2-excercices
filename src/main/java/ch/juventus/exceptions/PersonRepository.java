package ch.juventus.exceptions;

import ch.juventus.object.Person;

public class PersonRepository {
    public Person findById(int id) throws PersonNotFoundException {
        throw new PersonNotFoundException("No person with this id found");
    }

    public void AddPerson(Person person) {
        throw new IllegalArgumentException("oh noooo!");
    }
}
