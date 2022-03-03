package ch.juventus.object;

public class Application {
    public static void main(String[] args) {
        Address address = new Address(
                "Grindelstrasse",
                6,
                8303,
                "Bassersdorf"
        );
        System.out.println(address);

        Person person = new Person(
                "Roman",
                "Inglin",
                address,
                18,
                true
        );
        System.out.println(person);
    }
}
