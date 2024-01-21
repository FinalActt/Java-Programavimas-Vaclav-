import java.util.Random;

public class uzd1 {
    public static int[] generateNumbers(int dydis) {
        int[] masyvas = new int[dydis];
        Random random = new Random();

        for (int i = 0; i < dydis; i++) {
            masyvas[i] = random.nextInt();
        }

        return masyvas;
    }

    public static void main(String[] args) {
        int dydis = 5;
        int[] rezultatas = uzd1.generateNumbers(dydis);

        for (int skaicius : rezultatas) {
            System.out.println(skaicius);
        }
    }
}