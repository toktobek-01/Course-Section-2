import java.util.Scanner;
import java.util.SplittableRandom;

public class EnterName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name;");
        String input = sc.nextLine();

        char[] letters = input.toCharArray();

        System.out.println("Letters in your name:");

        for(int i = 0; i < letters.length; i++){
            System.out.println(letters[i]);
        }

    }
}
