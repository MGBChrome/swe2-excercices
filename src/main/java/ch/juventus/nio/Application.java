package ch.juventus.nio;

import java.io.IOException;
import java.nio.file.Path;

public class Application {
    public static void main(String[] args) throws IOException {
        NioExercises nioExercises = new NioExercises();

        nioExercises.createDirectory();
        nioExercises.createFile();
        nioExercises.writeToFile();
        nioExercises.renameFile();
        nioExercises.checkIfRenamedFileExists();
        nioExercises.readFromFile();
        nioExercises.listDirContent();
        nioExercises.deleteDir();
    }
}
