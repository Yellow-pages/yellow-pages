package contacts;

import java.util.ArrayList;
import java.util.List;
import util.FileHandler;
import  java.util.Scanner;

public class ContactApplication {

    public static void main(String[] args){
        ArrayList<String> contacts = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        FileHandler contactsFile = new FileHandler("data","contacts.txt");



        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");

        int userinput =scan.nextInt();
        scan.nextLine();

        switch (userinput){
            case 1: {
        List<String> lines = contactsFile.readFiles();
        for (String line : lines){
            System.out.println(line);
        }
        break;
            }
            case 2:{
                System.out.println("Enter name of a contact");
                String contactName = scan.nextLine();
                System.out.println("Enter a phone number");
                String contactNumber = scan.nextLine();
                Contact contact = new Contact(contactName, contactNumber);
                //addContact(contact, contacts);
                contacts.add(contact.toString());
                contactsFile.writeToFile(contacts);
            }

        }
    }

   /* public static List addContact(Contact contact, List<String> contacts) {
        contacts.add(contact.toString());
        return contacts;
    }*/
}
