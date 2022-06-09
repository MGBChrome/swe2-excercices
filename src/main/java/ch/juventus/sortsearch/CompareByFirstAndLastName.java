package ch.juventus.sortsearch;

import ch.juventus.xml.Person;

import java.util.Comparator;

public class CompareByFirstAndLastName implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        var firstNameComparison = p1.getFirstName().compareTo(p2.getFirstName());
        if (firstNameComparison != 0)
            return firstNameComparison;

        return p1.getLastName().compareTo(p2.getLastName());
    }
}
