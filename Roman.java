import java.util.Scanner;

public class Roman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman number: ");
        String romanNumber = scanner.nextLine().toUpperCase(); // Convert to uppercase to handle both upper and lower case input

        int result = integer(romanNumber);
        if (result == -1) {
            System.out.println("Invalid Roman number");
        } else {
            System.out.println("Integer equivalent: " + result);
        }

        scanner.close();
    }

    public static int integer(String romanNumber) {
        if (romanNumber == null || romanNumber.length() == 0) {
            return 0;
        }

        // Create a mapping of Roman number symbols to their integer values
        int[] values = new int[26];
        values['I' - 'A'] = 1;
        values['V' - 'A'] = 5;
        values['X' - 'A'] = 10;
        values['L' - 'A'] = 50;
        values['C' - 'A'] = 100;
        values['D' - 'A'] = 500;
        values['M' - 'A'] = 1000;

        int result = 0;
        int previous = 0;

        for (char c : romanNumber.toCharArray()) {
            int current = values[c - 'A'];
            if (current > previous) {
                result += current - 2 * previous; // Subtract the previous value twice
            } else {
                result += current;
            }
            previous = current;
        }

        // Check for invalid Roman numerals
        if (result != -1) {
            return result;
        } else {
            return -1;
        }
    }
}
