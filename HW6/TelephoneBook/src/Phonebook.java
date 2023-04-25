import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    List<Contact> contactList;

    public Phonebook() {
        contactList = new ArrayList<Contact>();
    }

    public boolean add(Contact cont) {
        if (!contactList.contains(cont)) {
            contactList.add(cont);
            return true;
        }
        return false;
    }

    public boolean remove(Contact cont) {
        if (!contactList.contains(cont)) {
            contactList.remove(cont);
            return true;
        }
        return false;
    }

    public Contact getContact(int index) {
        return contains(index) ? contactList.get(index) : null;
    }

    private boolean contains(int index) {
        return contactList != null
                && contactList.size() > index;
    }

    public void print() {
        for (Contact c : this.contactList
        ) {
            System.out.println(c);

        }
    }
}
