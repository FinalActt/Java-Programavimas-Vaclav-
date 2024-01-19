import java.util.HashSet;

public class Uzd19 {
    public static void main(String[] args) {
        int[] data = {1, 45, 1, 3, 3, 98, 15, -3, -3, 1};
        int[] uniqueArray = filterUniqueValues(data);

        System.out.println("Original array: " + arrayToString(data));
        System.out.println("Unique values array: " + arrayToString(uniqueArray));
    }

    public static int[] filterUniqueValues(int[] array) {
        HashSet<Integer> allValues = new HashSet<>();
        HashSet<Integer> repeatedValues = new HashSet<>();

        for (int value : array) {
            if (!allValues.add(value)) {
                repeatedValues.add(value);
            }
        }

        return allValues.stream()
                .filter(value -> !repeatedValues.contains(value))
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}