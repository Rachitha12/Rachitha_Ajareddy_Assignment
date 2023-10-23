import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        if (isPangram(sentence)) {
            System.out.println("This sentence is a pangram.");
        } else {
            System.out.println("This sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase(); // Convert input to lowercase for case-insensitivity

        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
