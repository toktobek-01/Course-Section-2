import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        HashMap<String, String> phonebook = new HashMap<>();

        phonebook.put("Tom", "223-423-3942");
        phonebook.put("Andrew", "122-456-5645");
        phonebook.put("John", "234-456-7678");
        phonebook.put("Emmy", "343-456-6789");
    }

    String name = "";

while (!name.equalsIgnoreCase("exit")) {
        System.out.print("Enter a name to search (or 'exit' to quit): ");
        name = scanner.nextLine();

        if (phonebook.containsKey(name)) {
            System.out.println("Phone number: " + phonebook.get(name));
        } else if (!name.equalsIgnoreCase("exit")) {
            System.out.println("Contact not found.");
        }
    }
