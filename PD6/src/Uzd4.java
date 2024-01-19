import java.util.Scanner;

public class Uzd4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array
        int[] array = new int[size];

        // Get array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Get the element to count occurrences
        System.out.print("Enter the element to count occurrences: ");
        int targetElement = scanner.nextInt();

        // Count occurrences
        int occurrences = countOccurrences(array, targetElement);

        // Display the result
        System.out.println("The element " + targetElement + " appears " + occurrences + " times in the array.");

        // Close the scanner
        scanner.close();
    }

    // Method to count occurrences of a specific element in an array
    private static int countOccurrences(int[] array, int targetElement) {
        int count = 0;

        for (int element : array) {
            if (element == targetElement) {
                count++;
            }
        }

        return count;
    }
}