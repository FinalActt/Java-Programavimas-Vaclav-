import java.util.Arrays;

public class Uzd11 {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 5, 8, 2, 7, 3};

        // Call the method to get the third smallest number
        int thirdSmallest = findThirdSmallest(numbers);

        // Print the result
        System.out.println("The third smallest number is: " + thirdSmallest);
    }

    // Method to find the third smallest number in an array
    public static int findThirdSmallest(int[] arr) {
        // Check if the array has at least three elements
        if (arr.length < 3) {
            System.out.println("Array should have at least three elements.");
            return -1; // Return a special value to indicate an error
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the third element (index 2 since arrays are zero-based)
        return arr[2];
    }
}