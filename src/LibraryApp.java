import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        System.out.println("📚 Welcome to the library!");
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> library = new HashMap<>();

        library.put("Stephen John", "Authomatic in AI");
        library.put("Jonathan Myles", "Mindset Changing Activites");
        library.put("Anthony Joshua", "We are what we eat.");
        library.put("John Mark", "American life is under development");
        library.put("Emily Yohanson", "The 5 minute english for new learners");

        String choice = "";

        while (!choice.equalsIgnoreCase("exit")) {
            System.out.println("\nMenu: search / add / list / exit");
            System.out.print("Your choice: ");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("search")) {
                System.out.print("Enter the name of an author to search: ");
                String nameAuthor = scanner.nextLine();
                if (library.containsKey(nameAuthor)) {
                    System.out.println(nameAuthor + " — " + library.get(nameAuthor));
                } else {
                    System.out.println("❌ Author not found.");
                }
            } else if (choice.equalsIgnoreCase("add")) {
                System.out.print("Enter author's name: ");
                String newAuthor = scanner.nextLine();
                System.out.print("Enter book's name: ");
                String newBook = scanner.nextLine();
                library.put(newAuthor, newBook);
                System.out.println("✅ Author added successfully.");
            } else if (choice.equalsIgnoreCase("list")) {
                System.out.println("📋 All books in the library:");
                for (Map.Entry<String, String> entry : library.entrySet()) {
                    System.out.println(entry.getKey() + " → " + entry.getValue());
                }
            } else if (!choice.equalsIgnoreCase("exit")) {
                System.out.println("⚠️ Invalid choice.");
            }
        }

        System.out.println("👋 Goodbye!");
        scanner.close();
    }
}
