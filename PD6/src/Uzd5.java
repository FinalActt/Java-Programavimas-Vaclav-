public class Uzd5{
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 1, 6, 10, 3};

        // Finding the minimum and maximum values
        int min = findMin(numbers);
        int max = findMax(numbers);

        // Displaying the results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    // Function to find the minimum value in the array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Function to find the maximum value in the array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}