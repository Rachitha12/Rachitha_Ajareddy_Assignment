import java.util.Scanner;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Create an array to store user values
        int[] arr = new int[size];

        // Populate the array with user input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // calling the shufflearray function
        shuffleArray(arr);

        // Display the shuffled array
        System.out.print("Shuffled Array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        scanner.close();
    }

    public static void shuffleArray(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
