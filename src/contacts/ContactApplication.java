package contacts;

import java.util.ArrayList;
import java.util.List;

import util.FileHandler;

import java.util.Scanner;

public class ContactApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FileHandler contactsFile = new FileHandler("data", "contacts.txt");
        List<String> contacts = contactsFile.readFiles();

        while(true) {

            System.out.println("1. View contacts.\n" +
                    "2. Add a new contact.\n" +
                    "3. Search a contact by name.\n" +
                    "4. Delete an existing contact.\n" +
                    "5. Exit.\n" +
                    "Enter an option (1, 2, 3, 4 or 5):");


            int userInput = scan.nextInt();
            scan.nextLine();

            switch (userInput) {
                case 1: {
                    for (String contact : contacts) {
                        System.out.println(contact);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter name of a contact");
                    String contactName = scan.nextLine();
                    System.out.println("Enter a phone number");
                    String contactNumber = scan.nextLine();
                    Contact contact = new Contact(contactName, contactNumber);
                    //addContact(contact, contacts);
                    contacts.add(contact.toString());
                    contactsFile.writeToFile(contacts, true);
                    break;
                }
                case 3: {
                    //loops through array to match user input with data
                    //compare data and user input with if statement
                    System.out.println("which user?");
                    String search = scan.nextLine();
                    for (String contact : contactsFile.readFiles()) {
                        String[] contactSplit = contact.split(",");
                        if (search.equalsIgnoreCase(contactSplit[0])) {
                            System.out.println(contactSplit[0] + " | " + contactSplit[1]);
                        } else {

                        }
                    }
                    break;
                }
                case 4:

                    System.out.println("delete who?");
                    String delete = scan.nextLine();

                    contacts.removeIf(contact -> {
                        if (contact.contains(delete)) {
                            System.out.println("Delete " + contact + "?(y/n)");
                            String yOrN = scan.nextLine();
                            if (yOrN.equalsIgnoreCase("y")) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                        return false;
                    });

                    contactsFile.writeToFile(contacts, false);
//                System.out.println("delete");
//                String delete = scan.nextLine();
//                for (String contact : contactsFile.readFiles()){
//                    String[] contactDelete = contacts.remove();
//                    if (delete.equalsIgnoreCase(contactDelete[0]))
//                }
                    break;
                case 5: {
                    System.out.printf("exit");
                    System.exit(0);
                }
            }
        }
//
//        public static String[] deleteContact(){
//            if()
//        }
   /* public static List addContact(Contact contact, List<String> contacts) {
        contacts.add(contact.toString());
        return contacts;
    }*/
    }
}
