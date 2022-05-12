package ch.juventus.streams;

import java.io.IOException;

public class CharacterStreamExercise {
    public static void main(String[] args) {
        MyReader reader = new MyReader();
        try {
            reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        MyWriter writer = new MyWriter();
        try {
            writer.write();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
