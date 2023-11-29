package Section10;
import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact person) {
        if (findContact(person) != -1) {
            return false;
        }
        this.myContacts.add(person);
        return true;
    }

    public boolean updateContact(Contact c1, Contact c2) {
        if (findContact(c1) < 0) {
            return false;
        }
        myContacts.set(this.myContacts.indexOf(c1), c2);
        return true;
    }

    public boolean removeContact(Contact person) {
        if (findContact(person) < 0) {
            return false;
        }
        return myContacts.remove(person);
    }

    private int findContact(Contact person) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(person.getName())) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int temp = findContact(name);
        if (temp < 0) {
            return null;
        }
        return myContacts.get(temp);
    }

    public void printContacts() {
        if (myContacts.isEmpty()) {
            System.out.println("");
        } else {
            System.out.println("Contact List:");
            for (int i = 0; i < myContacts.size(); i++) {
                System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
            }
        }
    }
}
