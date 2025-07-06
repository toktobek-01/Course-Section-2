import java.sql.SQLOutput;
import java.util.Scanner;

public class OriginalInReversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String input = scanner.nextLine();

        char[] original = input.toCharArray();
        char[] reversed = new char[original.length];

        for(int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        System.out.println("Reversed name from new array: ");
        for(char c : reversed) {
            System.out.print(c);
        }

    }
}
