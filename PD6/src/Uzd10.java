import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Uzd10 {
    public static void main(String[] args) {
        // Pavyzdiniai du masyvai
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {3, 4, 5, 6, 7};

        // Sujungiame masyvus
        Integer[] mergedArray = mergeArrays(array1, array2);

        // Pašaliname pasikartojančius elementus
        Integer[] resultArray = removeDuplicates(mergedArray);

        // Spausdiname rezultatą
        System.out.println("Sujungti masyvai be pasikartojančių elementų: " + Arrays.toString(resultArray));
    }

    // Metodas masyvų sujungimui
    private static Integer[] mergeArrays(Integer[] array1, Integer[] array2) {
        List<Integer> mergedList = new ArrayList<>(Arrays.asList(array1));
        mergedList.addAll(Arrays.asList(array2));
        return mergedList.toArray(new Integer[0]);
    }

    // Metodas pasikartojančių elementų pašalinimui
    private static Integer[] removeDuplicates(Integer[] array) {
        Set<Integer> uniqueElements = new HashSet<>(Arrays.asList(array));
        return uniqueElements.toArray(new Integer[0]);
    }
}