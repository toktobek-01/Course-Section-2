import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Scanner;
import java.time.LocalDateTime;
import  java.util.ArrayList;

public class ChildCareTracker {
    public static void main(String[] args) {
        System.out.println("\uD83D\uDC76 Welcome to Childcare Attendance Tracker!\n");

        Scanner scanner = new Scanner(System.in);

        // Tracks currently present children
        HashSet<String> presentChildren = new HashSet<>();
        ArrayList<String> logs = new ArrayList<>();


        String choice = "";

        while (!choice.equalsIgnoreCase("exit")) {
            System.out.println("\nMenu: enter / take / list / exit");
            System.out.print("Your choice: ");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("enter")) {
                System.out.print("Enter child's name: ");
                String child = scanner.nextLine();
                presentChildren.add(child);
                String timestamp = LocalDateTime.now().toString();
                logs.add("✅ " + child + " entered at " + timestamp);
                System.out.println("✅ " + child + " marked as Entered at " + timestamp);
                System.out.println("✅ " + child + " marked as Entered.");
            } else if (choice.equalsIgnoreCase("take")) {
                System.out.print("Enter child's name: ");
                String child = scanner.nextLine();
                if (presentChildren.contains(child)) {
                    presentChildren.remove(child);
                    System.out.println("❌ " + child + " marked as Taken.");
                } else {
                    System.out.println("⚠️ " + child + " is not currently present.");
                }
            } else if (choice.equalsIgnoreCase("list")) {
                System.out.println("📋 Children currently in childcare:");
                if (presentChildren.isEmpty()) {
                    System.out.println("No children are currently present.");
                } else {
                    for (String child : presentChildren) {
                        System.out.println("- " + child);
                    }
                }
            } else if (!choice.equalsIgnoreCase("exit")) {
                System.out.println("Invalid option.");
            }

        }

        System.out.println("👋 Goodbye!");
        scanner.close();
    }
}
