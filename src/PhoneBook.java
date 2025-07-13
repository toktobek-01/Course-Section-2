import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<>();

        phonebook.put("Tom", "223-423-3942");
        phonebook.put("Andrew", "122-456-5645");
        phonebook.put("John", "234-456-7678");
        phonebook.put("Emmy", "343-456-6789");

        String choice = "";

        while (!choice.equalsIgnoreCase("exit")) {
            System.out.println("\nMenu: search / add / exit");
            System.out.print("Your choice: ");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("search")) {
                System.out.print("Enter a name to search: ");
                String name = scanner.nextLine();
                if (phonebook.containsKey(name)) {
                    System.out.println("Phone number: " + phonebook.get(name));
                } else {
                    System.out.println("Contact not found.");
                }

            } else if (choice.equalsIgnoreCase("add")) {
                System.out.print("Enter name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter phone number: ");
                String newNumber = scanner.nextLine();

                phonebook.put(newName, newNumber);
                System.out.println("Contact added.");

            } else if (!choice.equalsIgnoreCase("exit")) {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}
