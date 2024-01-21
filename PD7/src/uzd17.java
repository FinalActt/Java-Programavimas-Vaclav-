import java.util.Arrays;

public class uzd17 {
    public static int[] didesniUzNurodyta(int[] masyvas, int skaicius) {
        return Arrays.stream(masyvas).filter(num -> num > skaicius).toArray();
    }

    public static void main(String[] args) {
        int[] masyvas = {2, 8, 5, 12, 7, 4};
        int[] result = didesniUzNurodyta(masyvas, 6);
        System.out.println("Rezultatas: " + Arrays.toString(result));
    }
}