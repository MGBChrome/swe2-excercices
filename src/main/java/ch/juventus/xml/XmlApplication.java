package ch.juventus.xml;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public class XmlApplication {
    public static void main(String[] args) {
        Person person = new Person("Max", "Muster");
        XmlPersonSerializer serializer = new XmlPersonSerializer();

        try {
            serializer.serializePerson(person);
            Person parsedPerson = serializer.deserializePerson();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
