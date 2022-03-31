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
//        arrayList();
//        linkedList();
//        hashSet();
//        linkedHashSet();
//        treeSet();
//        hashMap();
//        linkedHashMap();
//        treeMap();

        iterateArrayList();
        iterateLinkedList();
        iterateHashSet();
        iterateLinkedHashSet();
        iterateHashMap();
    }

    static void arrayList() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        printHeadLine(methodName);

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

        lastTodos(people);
    }

    static void treeSet() {
        Person petra = new Person("Petra", "Merz", null, 25, true);
        // TODO: Erstelle ein TreeSet von Personen (object package) und verwende den PersonComperator
        Set<Person> people = new TreeSet<>(new PersonComparator());
        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        people.add(new Person("Hans", "Muster", null, 25, true));
        people.add(new Person("Hans", "Muster", null, 25, true));
        people.add(new Person("Heinz", "Mueller", null, 25, true));
        people.add(petra);
        people.add(new Person("Hans", "Meier", null, 25, true));
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println("size: " + people.size());
        // TODO: Gib das gesamte Set auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
        System.out.println(people);
        System.out.println(people);
        System.out.println(people);
        System.out.println(people);
        System.out.println(people);
        System.out.println(people);
    }

    static void myTreeSet() {
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

    private static void initializePeople(Set<Person> people) {
        initializePeopleFields();

        people.add(person);
        people.add(uniquePerson);
        people.add(person2);
        people.add(uniquePerson2);
    }

    private static void lastTodos(Set<Person> people) {
        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println("size: " + people.size());
        // TODO: Gib das gesamte Set auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
        // Antwort: Reihenfolge ist anders als beim Hinzufügen, aber pro Ausführung immer gleich
        for (int i = 0; i < 10; i++)
        {
            System.out.println(people);
        }
    }

    static void hashMap() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        printHeadLine(methodName);

        // TODO: Erstelle eine HashMap (Key: String; Value: List<Person>)
        Map<String, List<Person>> people = new HashMap<>();
        // TODO: Füge folgende Einträge in die Map:
        //  ­ "family" : Liste von 3 Personen
        //  ­ "office" : null
        //  ­ "friends" : Liste von 3 Personen
        initializePeopleFields();
        List<Person> templatePeople = List.of(person, uniquePerson, uniquePerson2);
        people.put("family", templatePeople);
        String officeKey = "office";
        people.put(officeKey, null);
        people.put("friends", templatePeople);
        // TODO: Gib die gesamte Map auf der Konsole aus
        System.out.println("after adding: " + people);
        // TODO: Füge einen weiteren Eintrag "office" : Liste von 2 Personen der Map hinzu.
        //  (Wieviele Einträge sind jetzt in der Map?)
        List<Person> samePeople = List.of(person, person2);
        people.put(officeKey, samePeople);
        System.out.println("size: " + people.size());
        // TODO: Gib das entrySet auf der Konsole aus
        Set<Map.Entry<String, List<Person>>> entrySet = people.entrySet();
        System.out.println("entrySet: " + entrySet);
        // TODO: Gib das keySet auf der Konsole aus
        Set<String> keySet = people.keySet();
        System.out.println("keySet: " + keySet);
        // TODO: Gib die values auf der Konsole aus
        Collection<List<Person>> values = people.values();
        System.out.println("values: " + values);
    }

    static void linkedHashMap() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        printHeadLine(methodName);

        // TODO: Erstelle eine LinkedHashMap (Key: Integer; Value: Person) mit Access-Order
        Map<Integer, Person> people = new LinkedHashMap<>(16, .75f, true);
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        initializePeople(people);
        // TODO: Gib die gesamte Map auf der Konsole aus
        System.out.println("after adding: " + people);
        // TODO: Greife auf mehrere Elemente zu
        System.out.println("key 1: " + people.get(1));
        System.out.println("after accessing key 1: " + people);
        System.out.println("key 3: " + people.get(3));
        System.out.println("after accessing key 3: " + people);
        System.out.println("key 3: " + people.get(3));
        System.out.println("after accessing key 3: " + people);
        System.out.println("key 2: " + people.get(2));
        // TODO: Gib die Map erneut aus und überprüfe die Sortierung
        // TODO: Gib die gesamte Map auf der Konsole aus
        System.out.println("after accessing the keys: " + people);
    }

    static void treeMap() {
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        printHeadLine(methodName);

        // TODO: Erstelle eine TreeMap (Key: Integer; Value: Person)
        Map<Integer, Person> people = new TreeMap<>();
        initializePeople(people);
        // TODO: Gib die gesamte Map auf der Konsole aus und überprüfe die Sortierung
        System.out.println("after adding: " + people);
    }

    private static void initializePeople(Map<Integer, Person> people) {
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        initializePeopleFields();
        people.put(1, person);
        people.put(3, uniquePerson);
        people.put(2, person2);
        people.put(1, uniquePerson);
        people.put(4, uniquePerson2);
    }

    private static void printHeadLine(String methodName) {
        System.out.println();
        System.out.println("Call " + methodName + "()");
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

    private static void iterateArrayList() {
        List<String> companies = List.of("Google", "Amazon", "Facebook", "Rotronic");

        printWholeCompanies("iterateArrayList()", companies);
    }

    private static void iterateLinkedList() {
        List<String> companies = new LinkedList<>();
        companies.add("Google");
        companies.add("Amazon");
        companies.add("Facebook");
        companies.add("Rotronic");

        printWholeCompanies("iterateLinkedList()", companies);

        companies.removeIf(c -> c.startsWith("Go"));

        printWholeCompanies("after removing", companies);
    }

    private static void iterateHashSet() {
        Set<String> companies = Set.of("Google", "Amazon", "Facebook", "Rotronic");

        printWholeCompanies("iterateHashSet()", companies);
    }

    private static void iterateLinkedHashSet() {
        Set<String> companies = new LinkedHashSet<>();
        companies.add("Google");
        companies.add("Facebook");
        companies.add("Amazon");
        companies.add("Facebook");
        companies.add("Rotronic");
        companies.add("Amazon");

        printWholeCompanies("iterateLinkedHashSet()", companies);
    }

    private static void printWholeCompanies(String headline, Collection<String> companies) {
        System.out.println();
        System.out.println(headline);
        for (String company : companies) {
            System.out.println(company);
        }

        System.out.println();
        System.out.println("forEach call");
        companies.forEach(System.out::println);
    }

    private static void iterateHashMap() {
        Map<Integer, String> companies = Map.of(
                1,"Google",
                3, "Amazon",
                5, "Facebook",
                9, "Rotronic"
        );

        System.out.println();
        System.out.println("iterateHashMap.keySet()");
        for (Integer key : companies.keySet()) {
            System.out.println(key);
        }

        printWholeCompanies("iterateHashMap.values()", companies.values());

        System.out.println();
        System.out.println("iterateHashMap.entrySet()");
        for (Map.Entry<Integer, String> entry : companies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            System.out.println(entry);
        }
    }
}
