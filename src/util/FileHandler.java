package util;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FileHandler {
    private String directory;
    private String filename;
    private Path path;

    public FileHandler(String directory, String filename) {
        this.directory = directory;
        this.filename = filename;
        this.path = Paths.get(this.directory, this.filename);
    }

    public boolean createDirectory() {
        try {
            if (!Files.exists(path.getParent())) {
                Files.createDirectory(path.getParent());
            }
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public void writeToFile(List<String> contents, boolean append) {
    try {
        Files.write(this.path, contents);
    }
    catch(IOException e){
        System.out.printf("Error: %s\n", e.getMessage());
        }
    }

    public List<String> readFiles(){
        try {
            List<String> myContacts = Files.readAllLines(this.path);
            return myContacts;
        }catch (IOException e){
            System.out.printf("Error: %s\n", e.getMessage());
            return null;
        }
    }



}
