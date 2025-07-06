import java.util.HashMap;
import java.util.Scanner;

public class whileTask {
    public static void main(String[] args) {
        HashMap<String, Integer> truckCompany = new HashMap<>();
        truckCompany.put("john", 12);
        truckCompany.put("mike", 134);
        truckCompany.put("emily", 234);
        truckCompany.put("sean", 231);

        Scanner sc = new Scanner(System.in);

        String name = ""; // initial value

        while (!name.equalsIgnoreCase("exit")) {
            System.out.print("Enter driver's name (or type 'exit' to quit): ");
            name = sc.nextLine().toLowerCase();

            if (!name.equals("exit")) {
                if (truckCompany.containsKey(name)) {
                    System.out.println("Truck number of " + capitalize(name) + ": " + truckCompany.get(name));
                } else {
                    System.out.println("Driver not found.");
                }
            }
        }

        System.out.println("Goodbye!");
    }

    // Capitalizes the first letter
    public static String capitalize(String input) {
        if (input == null || input.isEmpty()) return input;
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}
