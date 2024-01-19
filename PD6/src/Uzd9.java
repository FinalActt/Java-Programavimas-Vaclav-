import java.util.Arrays;
import java.util.Random;

public class Uzd9 {
    public static void main(String[] args) {
        // Pavyzdinė masyvo dydis
        int[] array = {1, 2, 3, 4, 5};

        // Iškviečiame shuffle metodą
        shuffleArray(array);

        // Atspausdiname sumaišytą masyvą
        System.out.println("Sumaišytas masyvas: " + Arrays.toString(array));
    }

    // Metodas, kuris sumaišo masyvo elementus
    public static void shuffleArray(int[] array) {
        Random rand = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);

            // Keičiame vietomis elementus
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}