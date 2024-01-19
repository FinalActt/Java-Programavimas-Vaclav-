public class Uzd17 {
    public static void main(String[] args) {
        // Data: {23, 45, 12, 3, 78, 98, 15, -3}
        int[] data = {23, 45, 12, 3, 78, 98, 15, -3};

        // Filtered even numbers array
        int[] evenNumbers = filterEvenNumbers(data);

        // Print the original array
        System.out.print("Original array: ");
        printArray(data);

        // Print the array with filtered even numbers
        System.out.print("Array of even numbers: ");
        printArray(evenNumbers);
    }

    // Method to filter even numbers from the given array
    public static int[] filterEvenNumbers(int[] array) {
        int evenCount = 0;

        // Count the number of even elements in the array
        for (int number : array) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        // Create a new array to store even numbers
        int[] evenNumbers = new int[evenCount];
        int index = 0;

        // Populate the new array with even numbers
        for (int number : array) {
            if (number % 2 == 0) {
                evenNumbers[index] = number;
                index++;
            }
        }

        return evenNumbers;
    }

    // Method to print an array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}