public class MorePractice {
    public static void main(String[] args) {
        String dog = "Shaggy";
        System.out.println("Your pet's name is: " + dog);

        for(int i = 0; i < dog.length(); ++i) {
            char s = dog.charAt(i);

            System.out.println("Index: " + i + " Character: " + s);
        }
    }
}
