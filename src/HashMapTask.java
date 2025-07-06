import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask {
    public static void main(String[] args) {
        HashMap<String, Integer> truckCompany = new HashMap<>();
        truckCompany.put("John", 912);
        truckCompany.put("Mike", 134);
        truckCompany.put("Emily", 234);
        truckCompany.put("Sean", 231);
        System.out.println("Truck number of: " + truckCompany.get("John"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter driver's name: ");
        String name = scanner.nextLine();

        if (truckCompany.containsKey(name)) {
            System.out.println("Truck number of " + name + ": " + truckCompany.get(name));
        } else {
            System.out.println("Driver not found...");
        }
    }
}
