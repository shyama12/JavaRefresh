import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contact> contactsList;

    public MobilePhone() {
        contactsList = new ArrayList<Contact>();
    }

    public void addContact(Contact contact) {
        if (contactExists(contact.getName())) {
            System.out.println("The contact already exists");
        } else {
            this.contactsList.add(contact);
            System.out.println("Contact Added\n\n");
        }
    }

    public void modifyContact(String name, int choice, String newName, String newNumber) {
        if (contactExists(name)) {
            switch (choice) {
                case 1:
                    for (int i = 0; i < contactsList.size(); i++) {
                        if (contactsList.get(i).getName().equals(name.toUpperCase())) {
                            boolean thisNameExistes = false;
                            for (int j = 0; j < contactsList.size(); j++) {
                                if (contactsList.get(j).getName().equals(newName.toUpperCase()) && j != i) {
                                    thisNameExistes = true;
                                }
                            }
                            if (thisNameExistes) {
                                System.out.println("This name already exists");
                            } else {
                                contactsList.get(i).setName(newName);
                            }
                            break;
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < contactsList.size(); i++) {
                        if (contactsList.get(i).getName().equals(name.toUpperCase())) {
                            contactsList.get(i).setPhoneNumber(newNumber);
                            break;
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < contactsList.size(); i++) {
                        if (contactsList.get(i).getName().equals(name.toUpperCase())) {
                            boolean thisNameExistes = false;
                            for (int j = 0; j < contactsList.size(); j++) {
                                if (contactsList.get(j).getName().equals(newName.toUpperCase()) && j != i) {
                                    thisNameExistes = true;
                                }
                            }
                            if (thisNameExistes) {
                                System.out.println("This name already exists");
                            } else {
                                contactsList.get(i).setName(newName);
                                contactsList.get(i).setPhoneNumber(newNumber);

                            }
                            break;
                        }
                    }
                    break;

            }
        } else {
            System.out.println("Contact does not exist");
        }
    }

    public boolean contactExists(String name) {
        if (!(contactsList == null)) {
            for (int i = 0; i < contactsList.size(); i++) {
                if (contactsList.get(i).getName().equals(name.toUpperCase())) {
                    return true;
                }
            }
        } else {
            return false;
        }
        return false;
    }

    public void displayContacts() {
        if (contactsList.size() != 0 && contactsList != null) {
            System.out.println("---------------------------------------------------");
            for (int i = 0; i < contactsList.size(); i++) {
                System.out.println("Name : " + contactsList.get(i).getName());
                System.out.println("Number : " + contactsList.get(i).getPhoneNumber());
                System.out.println("---------------------------------------------------");
            }
        } else {
            System.out.println("No contacts to display");
        }
    }


    public void removeContact(String name) {
        if (contactExists(name)) {
            for (int i = 0; i < contactsList.size(); i++) {
                if (contactsList.get(i).getName().equals(name.toUpperCase())) {
                    contactsList.remove(i);
                    System.out.println("Contact Removed");
                    break;
                }
            }
        } else {
            System.out.println("Contact does not exist");
        }
    }


}
