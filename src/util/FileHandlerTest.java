package util;

import java.nio.file.Files;

public class FileHandlerTest {
    public static void main(String[] args) {
        FileHandler contactsFile = new FileHandler("data","contacts.txt");
        contactsFile.createDirectory();



    }
}
