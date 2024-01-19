public class Uzd14 {
    public static void main(String[] args) {
        // Sample arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 6, 7, 8, 9};

        // Check if there is at least one common element
        if (containsCommonElement(array1, array2)) {
            System.out.println("Arrays have at least one common element.");
        } else {
            System.out.println("Arrays do not have common elements.");
        }
    }

    // Method to check if two arrays have at least one common element
    private static boolean containsCommonElement(int[] array1, int[] array2) {
        for (int element1 : array1) {
            for (int element2 : array2) {
                if (element1 == element2) {
                    return true;
                }
            }
        }
        return false;
    }
}