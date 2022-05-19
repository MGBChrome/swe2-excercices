package ch.juventus.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class XmlPersonSerializer {
    public void serializePerson(Person person) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(person);
        System.out.println(xml);

        Path xmlFile = Paths.get("src/main/resources/xmlFile.xml");
        Files.createFile(xmlFile);
        Files.writeString(xmlFile, xml);
    }

    public Person deserializePerson() throws IOException {
        Path xmlFile = Paths.get("src/main/resources/xmlFile.xml");
        String xmlContent = Files.readString(xmlFile);

        XmlMapper xmlMapper = new XmlMapper();
        Person parsedPerson = xmlMapper.readValue(xmlContent, Person.class);
        System.out.println(parsedPerson);
        return parsedPerson;
    }
}
