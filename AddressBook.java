//task 4 code
import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public void displayAllContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public Contact findContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    // Other methods to search contacts by phone, email, etc. can also be added.

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        // Adding contacts to the address book
        addressBook.addContact(new Contact("John Doe", "123-456-7890", "john@example.com"));
        addressBook.addContact(new Contact("Jane Smith", "987-654-3210", "jane@example.com"));

        // Displaying all contacts
        System.out.println("All Contacts:");
        addressBook.displayAllContacts();

        // Finding contact by name
        String searchName = "John Doe";
        Contact foundContact = addressBook.findContactByName(searchName);
        if (foundContact != null) {
            System.out.println("\nFound contact for name '" + searchName + "':");
            System.out.println(foundContact);
        } else {
            System.out.println("\nContact not found for name '" + searchName + "'.");
        }
    }
}
