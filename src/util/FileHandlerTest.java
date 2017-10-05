package util;
import contacts.Contact;
import java.util.List;
import java.util.ArrayList;

public class FileHandlerTest {
    public static void main(String[] args) {
        FileHandler contactsFile = new FileHandler("data","contacts.txt");

        contactsFile.createDirectory();

        Contact contact = new Contact("joe", "111-111-1111");
        Contact contact1 = new Contact("alex", "222-333-4444");
        Contact contact2 = new Contact("jack", "111=222=3333");

        System.out.println(contact.toString());

//        contactsFile.writeToFile();

//
//        contactsFile.writeToFile(contact.addContact());
//        contactsFile.writeToFile(contact1.addContact());
//        contactsFile.writeToFile(contact2.addContact());
    }
}
