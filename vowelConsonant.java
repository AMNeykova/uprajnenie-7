import java.util.Scanner;

public class vowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Letter: ");
        String input = scanner.next().toLowerCase();

        boolean upperCase = input.charAt(0) >= 65 && input.charAt(0) <= 98;
        boolean lowerCase = input.charAt(0) >= 97 && input.charAt(0) <= 122;

        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1) {
            System.out.println("Not a single character.");
        } else if (!(upperCase || lowerCase)) {
            System.out.println("Not a letter");
        } else if (vowels) {
            System.out.println("Letter is vowel");
        }
        else
        {
            System.out.println("Letter is consonant");
        }

    }
}
