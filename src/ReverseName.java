import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        char[] inputName = name.toCharArray();
        System.out.println("Letters in your name: ");

        for (int i = inputName.length - 1; i >= 0; i--) {
            System.out.println(inputName[i]);
        }
    }
}
