package ch.juventus.nio;

import java.io.IOException;
import java.nio.file.*;

public class NioExercises {
    private final String basePath = "c:\\software-entwicklung\\soe2\\NioExercise";
    private final String fileName = "NewTextFile.txt";
    private final String renamedFileName = "RenamedTextFile.txt";

    public void createDirectory() {
        Path directoryPath = Paths.get(basePath);
        try {
            Files.createDirectories(directoryPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createFile() throws IOException {
        String filePathUri = String.format("%s\\%s", basePath, fileName);
        Path filePath = Paths.get(filePathUri);
        Path newFile =  Files.createFile(filePath);
    }

    public void writeToFile() throws IOException {
        String filePathUri = String.format("%s\\%s", basePath, fileName);
        Path newFile = Paths.get(filePathUri);
        Files.writeString(newFile, "Hello world, this is a new text in the file");
        Files.writeString(newFile, "\nthis is appended", StandardOpenOption.APPEND);
    }

    public void renameFile() throws IOException {
        String filePathUri = String.format("%s\\%s", basePath, fileName);
        Path newFile = Paths.get(filePathUri);
        String renamedPathUri = String.format("%s\\%s", basePath, renamedFileName);
        Path renamedFile = Paths.get(renamedPathUri);
        Files.move(newFile, renamedFile, StandardCopyOption.REPLACE_EXISTING);
    }

    public void checkIfRenamedFileExists() {
        String renamedPathUri = String.format("%s\\%s", basePath, renamedFileName);
        Path renamedFile = Paths.get(renamedPathUri);
        System.out.println("renamed file exists: " + Files.exists(renamedFile));
    }

    public void readFromFile() throws IOException {
        String renamedPathUri = String.format("%s\\%s", basePath, renamedFileName);
        Path renamedFile = Paths.get(renamedPathUri);
        String content = Files.readString(renamedFile);
        System.out.println("File-content:");
        System.out.println(content);
    }

    public void listDirContent() throws IOException {
        Path directory = Paths.get(basePath);
        DirectoryStream<Path> content = Files.newDirectoryStream(directory);
        for(Path path : content) {
            System.out.println(path);
        }
    }

    public void deleteDir() throws IOException {
        Path directory = Paths.get(basePath);
        deleteDirRecursive(directory);
    }

    public void deleteDirRecursive(Path dir) throws IOException {
        DirectoryStream<Path> content = Files.newDirectoryStream(dir);
        for(Path path: content) {
            if(Files.isDirectory(path)) {
                deleteDirRecursive(path);
            } else {
              Files.delete(path);
            }

            Files.delete(dir);
        }
    }
}
