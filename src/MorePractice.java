import java.util.Scanner;

public class MorePractice {
    public static void main(String[] args) {
       // System.out.println("Your pet's name is: " + dog);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine().toUpperCase();
        System.out.println("Your name is: " + name);

        char [] letters = name.toCharArray();
        char [] reverse = new char [letters.length];

        for(int i = 0; i < reverse.length; i++) {
            reverse[i] = letters[letters.length - 1 -i];
        }
        System.out.println("Revers of your name is: " + reverse);

        for ( int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }



    }
}
