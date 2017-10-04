package util;
import contacts.Contact;

import java.util.ArrayList;

public class FileHandlerTest {
    public static void main(String[] args) {
        FileHandler contactsFile = new FileHandler("data","contacts.txt");

        Contact contact = new Contact("joe", "111-111-1111");
        Contact contact1 = new Contact("alex", "222-333-4444");


        contactsFile.createDirectory();


        contactsFile.writeToFile(contact.addContact());
        contactsFile.writeToFile(contact1.addContact());
    }
}
