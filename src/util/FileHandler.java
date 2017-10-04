package util;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class FileHandler {
    private String directory;
    private String filename;

    public FileHandler(String directory, String filename){
        this.directory = directory;
        this.filename = filename;
    }

    public Path createDirectory(Path directory) throws IOException {
        if (!Files.exists(directory)) {
            Files.createDirectory(directory);
        }
        return directory;
    }

    public Path createFile(Path filename) throws IOException {
        if (!Files.exists(filename)) {
            Files.createFile(filename);
        }
        return filename;
    }

}
