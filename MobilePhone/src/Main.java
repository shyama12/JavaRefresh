import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MobilePhone mobilePhone = new MobilePhone();
        int choice = -1;

        while (choice != 0) {
            System.out.println("Press ");
            System.out.println("\t\t0 - to exit ");
            System.out.println("\t\t1 - to add a contact ");
            System.out.println("\t\t2 - to modify a contact ");
            System.out.println("\t\t3 - to display contacts ");
            System.out.println("\t\t4 - to remove a contact ");

            choice = scanner.nextInt();
            scanner.nextLine();

            String name;
            String number;
            switch (choice) {
                case 0:
                    choice = 0;
                    break;
                case 1:
                    System.out.println("Enter a contact name : ");
                    name = scanner.nextLine();
                    System.out.println("Enter phone number : ");
                    number = scanner.nextLine();
                    Contact contact = new Contact(name, number);
                    mobilePhone.addContact(contact);
                    break;
                case 2:
                    System.out.println("Enter the name of the contact you wish to modify : ");
                    name = scanner.nextLine();

                    int choiceMod = 0;
                    System.out.println("What would you wish to modify? Press ");
                    System.out.println("\t\t1 - name");
                    System.out.println("\t\t2 - number");
                    System.out.println("\t\t3 - both");

                    choiceMod = scanner.nextInt();
                    scanner.nextLine();

                    switch (choiceMod) {
                        case 1:
                            System.out.println("Enter new name : ");
                            String newName = scanner.nextLine();
                            mobilePhone.modifyContact(name, 1, newName, "");

                            break;
                        case 2:
                            System.out.println("Enter new number : ");
                            String newNumber = scanner.nextLine();
                            mobilePhone.modifyContact(name, 2, "", newNumber);
                            break;

                        case 3:
                            System.out.println("Enter new name : ");
                            newName = scanner.nextLine();
                            System.out.println("Enter new number : ");
                            newNumber = scanner.nextLine();
                            mobilePhone.modifyContact(name, 3, newName, newNumber);
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                case 3:
                    mobilePhone.displayContacts();
                    break;
                case 4:
                    System.out.println("Enter the name of the contact you wish to remove : ");
                    name = scanner.nextLine();
                    mobilePhone.removeContact(name);
                    break;
                default:
                    System.out.println("Invalid choice");


            }

        }
    }

}
