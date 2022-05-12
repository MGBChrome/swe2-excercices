package ch.juventus.streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MyWriter {
    public void write() throws IOException {
        Writer writer = new FileWriter("src\\main\\resources\\myRelativeTextWriter2.txt");
        StringBuilder outputText = new StringBuilder();
        outputText.append("Das ist der Testtitel");
        outputText.append("\n");
        outputText.append("Ich schreibe gerade in ein Textfile. Das ist mein erster Erfolg.");
        writer.write(outputText.toString());
        writer.close();
    }
}
