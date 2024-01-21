import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class uzd3 {

    public static void main(String[] args) {
         ArrayList<Integer> skaiciai = generateRandomNumbers(5000000);

        System.out.println("Nesurūšiuotas sąrašas:");
        printList(skaiciai);

        Collections.sort(skaiciai);

        System.out.println("\nSurūšiuotas sąrašas didėjančia tvarka:");
        printList(skaiciai);
    }


    private static ArrayList<Integer> generateRandomNumbers(int size) {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            randomNumbers.add(random.nextInt(1000000));
        }

        return randomNumbers;
    }


    private static void printList(ArrayList<Integer> list) {
        for (int number : list) {
            System.out.print(number + " ");
        }
    }
}