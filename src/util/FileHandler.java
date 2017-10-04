package util;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandler {
    private String directory;
    private String filename;

    public FileHandler(String directory, String filename){
        this.directory = directory;
        this.filename = filename;
    }

    public boolean createDirectory(){
        Path path = Paths.get(this.directory, this.filename);
        try {
            if (!Files.exists(path.getParent())) {
                Files.createDirectory(path.getParent());
            }
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
        }catch (IOException e){
            return false;
        }
        return true ;
    }




}
