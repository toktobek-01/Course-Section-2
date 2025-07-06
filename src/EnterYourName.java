import java.util.Scanner;

public class EnterYourName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String input = scanner.nextLine();
        System.out.println("Your name is: " + input);

        char[] letters = input.toCharArray();
        char[] reverse = new char[letters.length];

       for (int i = 0; i < letters.length; i++) {
           reverse[i] = letters[letters.length - 1 -i];
       }
        System.out.println(reverse);

        for(int i = 0; i < letters.length; i++){
            System.out.println("Your name  spells: " + letters[i]);
        }

    }
}
