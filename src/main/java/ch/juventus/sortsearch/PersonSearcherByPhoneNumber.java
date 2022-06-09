package ch.juventus.sortsearch;

import ch.juventus.xml.Person;

import java.util.Map;

public class PersonSearcherByPhoneNumber {
    private PersonSearcherByPhoneNumber() { }

    public static Person findFirstOrDefault(Map<Person, String> people, String phoneNumber) {
        // Das ist doppelt gemoppelt
//        if(!people.containsValue(phoneNumber)) {
//            return null;
//        }

        for (Map.Entry<Person, String> entry : people.entrySet()) {
            if (entry.getValue().equals(phoneNumber))
                return entry.getKey();
        }

        return null;
    }
}
