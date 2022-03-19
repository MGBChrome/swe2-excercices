package ch.juventus.collections;

import ch.juventus.object.Address;
import ch.juventus.object.Person;

import java.util.*;

public class CollectionsExercise {
    private static Person person;
    private static Person person2;
    private static Person uniquePerson;
    private static Person uniquePerson2;

    public static void main(String[] args) {
        //arrayList();
        //linkedList();
        hashSet();
        linkedHashSet();
        treeSet();
        hashMap();
        linkedHashMap();
        treeMap();
    }

    static void arrayList() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        printHeadLine(methodName);
        System.out.println();
        System.out.println("Call arrayList()");
        // TODO: Erstelle eine ArrayList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
        List<String> animals = new ArrayList<>();
        animals.add("Hunde");
        animals.add("Katze");
        animals.add("Maus");
        animals.add("Elefant");
        animals.add("Hamster");
        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
        System.out.println("animal-size: " + animals.size());
        // TODO: Füge ein weiteres Element mit Index 2 hinzu.
        animals.add(2, "Kuh");
        // TODO: Gib die ganze Liste auf der Konsole aus.
        System.out.println("after adding: " + animals);
        // TODO: Prüfe ob ein bestimmtes Element in der Liste vorkommt.
        boolean containsMaus = animals.contains("Maus");
        System.out.println("contains Maus: " + containsMaus);
        boolean containsPferd = animals.contains("Pferd");
        System.out.println("contains Pferd: " + containsPferd);
        // TODO: Ein Element lesen via Index.
        String elementAtIndexTwo = animals.get(2);
        System.out.println("get index 2: " + elementAtIndexTwo);
        // TODO: Ein Element löschen via Index
        animals.remove(3);
        System.out.println("after removing index 3: " + animals);
        // TODO: Ein Element löschen via String
        animals.remove("Elefant");
        System.out.println("after removing Elefant: " + animals);
        // TODO: Ein Element löschen via Index, das es nicht gibt (was passiert?)
        //animals.remove(999);
        // TODO: Ein Element löschen via String, das es nicht gibt (was passiert?)
        animals.remove("Pferd");
        System.out.println("after removing not existing Pferd: " + animals);

        // TODO: Alle Elemente aus der Liste löschen
        animals.clear();
        System.out.println("after clearing: " + animals);
    }

    static void linkedList() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        printHeadLine(methodName);
        System.out.println();
        System.out.println("Call linkedList()");
        // TODO: Erstelle eine LinkedList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Hunde");
        animals.add("Katze");
        animals.add("Maus");
        animals.add("Elefant");
        animals.add("Hamster");
        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
        System.out.println("animal-size: " + animals.size());
        // TODO: Den Index eines bestimmten Elements finden
        System.out.println("index of Katze: " + animals.indexOf("Katze"));
        // TODO: Den Index eines Elements das nicht existiert finden (was passiert?)
        System.out.println("index of Kuh: " + animals.indexOf("Kuh"));
        // TODO: Ein Element via Index lesen
        System.out.println("get index 2: " + animals.get(2));
        // TODO: Das erste und letzte Element der Liste ausgeben
        System.out.println("first: " + animals.getFirst());
        System.out.println("last: " + animals.getLast());
        // TODO: Das erste und letzte Element der Liste löschen
        animals.removeFirst();
        animals.removeLast();
        System.out.println("after removing: " + animals);
    }

    static void hashSet() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        printHeadLine(methodName);
        // TODO: Erstelle ein HashSet von Personen (object package)
        Set<Person> people = new HashSet<>();
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        initializePeople(people);

        // TODO: Prüfe, ob das Set nicht leer ist
        System.out.println("is Empty: " + people.isEmpty());
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println("size: " + people.size());
        // TODO: Prüfe, ob ein gewisses Element im Set existiert
        System.out.println("contains person: " + people.contains(person));
        System.out.println("contains person2: " + people.contains(person2));
        // TODO: Lösche ein bestimmtes Element aus dem Set
        people.remove(uniquePerson2);
        // TODO: Gib das gesamte Set mehrmals auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
        // Antwort: Reihenfolge ist anders als beim Hinzufuegen, aber immer gleich
        for (int i = 0; i < 10; i++)
        {
            System.out.println(people);
        }
    }

    private static void printHeadLine(String methodName) {
        System.out.println();
        System.out.println("Call " + methodName + "()");
    }

    private static void initializePeople(Set<Person> people) {
        initializePeopleFields();

        people.add(person);
        people.add(uniquePerson);
        people.add(person2);
        people.add(uniquePerson2);
    }

    static void linkedHashSet() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        printHeadLine(methodName);
        // TODO: Erstelle ein HashSet von Personen (object package)
        Set<Person> people = new LinkedHashSet<>();
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        initializePeople(people);

        // TODO: Prüfe, ob das Set nicht leer ist
        System.out.println("is Empty: " + people.isEmpty());
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        lastTodos(people);
    }

    static void treeSet() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        printHeadLine(methodName);
        // TODO: Erstelle ein TreeSet von Personen (object package) und verwende den PersonComperator
        PersonComparator comparator = new PersonComparator();
        Set<Person> people = new TreeSet<>(comparator);
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        initializePeople(people);

        lastTodos(people);
    }

    private static void initializePeopleFields() {
        Address address = new Address(
                "Grindelstrasse",
                6,
                8303,
                "Bassersdorf"
        );
        Address address2 = new Address(
                "Grindelstrasse",
                6,
                8303,
                "Bassersdorf"
        );

        person = new Person(
                "Roman",
                "Inglin",
                address,
                18,
                true
        );
        person2 = new Person(
                "Roman",
                "Inglin",
                address2,
                18,
                true
        );

        uniquePerson = new Person(
                "Patrick",
                "Muellhaupt",
                address,
                65,
                false
        );

        uniquePerson2 = new Person(
                "Clemens",
                "Duzy",
                address,
                65,
                false
        );
    }

    private static void lastTodos(Set<Person> people) {
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println("size: " + people.size());
        // TODO: Gib das gesamte Set auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
        // Antwort: Reihenfolge ist anders als beim Hinzufügen, aber immer gleich
        for (int i = 0; i < 10; i++)
        {
            System.out.println(people);
        }
    }

    static void hashMap() {
        // TODO: Erstelle eine HashMap (Key: String; Value: List<Person>)
        // TODO: Füge folgende Einträge in die Map:
        //  ­ "family" : Liste von 3 Personen
        //  ­ "office" : null
        //  ­ "friends" : Liste von 3 Personen
        // TODO: Gib die gesamte Map auf der Konsole aus
        // TODO: Füge einen weiteren Eintrag "office" : Liste von 2 Personen der Map hinzu.
        //  (Wieviele Einträge sind jetzt in der Map?)
        // TODO: Gib das entrySet auf der Konsole aus
        // TODO: Gib das keySet auf der Konsole aus
        // TODO: Gib die values auf der Konsole aus
    }

    static void linkedHashMap() {
        // TODO: Erstelle eine LinkedHashMap (Key: Integer; Value: Person) mit Access-Order
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        // TODO: Gib die gesamte Map auf der Konsole aus
        // TODO: Greife auf mehrere Elemente zu
        // TODO: Gib die Map erneut aus und überprüfe die Sortierung
    }

    static void treeMap() {
        // TODO: Erstelle eine TreeMap (Key: Integer; Value: Person)
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        // TODO: Gib die gesamte Map auf der Konsole aus und überprüfe die Sortierung
    }
}
