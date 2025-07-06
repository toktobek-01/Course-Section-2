import java.util.Scanner;
import java.util.HashMap;


public class MorePractice {
    public static void main(String[] args) {
       // System.out.println("Your pet's name is: " + dog);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine().toUpperCase();

        System.out.println("Your name is: " + name);

        HashMap<Character, Integer> countMap = new HashMap<>();

        char [] letters = name.toCharArray();

        char [] reverse = new char [letters.length];
        for(int i = 0; i < reverse.length; i++) {
            reverse[i] = letters[letters.length - 1 -i];
        }

        String reversedName = new String(reverse);
        System.out.println("Revers of your name is: " + reversedName);

        for(char c : letters) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (char key : countMap.keySet()) {
            System.out.println("Character: " + key + " → Count: " + countMap.get(key));
        }
    }
}
