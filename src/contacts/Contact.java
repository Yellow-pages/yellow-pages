package contacts;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private String number;


    public Contact(String name, String number){
        this.name = name;
        this.number = number;

    }

    public String toString(){
        return name + "," + number;
    }



//    public List addContact() {
//        ArrayList<String> contact = new ArrayList<>();
//        contact.add(this.name + "," + this.number);
//        return contact;
//    }
}
