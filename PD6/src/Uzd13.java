public class Uzd13 {
    public static void main(String[] args) {
        // Sample arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        // Check if arrays are equal
        boolean areArraysEqual = compareArrays(array1, array2);

        // Print the result
        if (areArraysEqual) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }

    // Method to compare if two arrays are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        // Check the length of arrays
        if (array1.length != array2.length) {
            return false;
        }

        // Check each element
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        // If all elements match, arrays are equal
        return true;
    }
}