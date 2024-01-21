import java.util.Arrays;

public class uzd15 {
    public static void antrasisMinMax(int[] masyvas) {
        if (masyvas.length < 2) {
            System.out.println("Masyve turi būti bent du skaičiai.");
            return;
        }
        Arrays.sort(masyvas);
        System.out.println("Antrasis mažiausias: " + masyvas[1]);
        System.out.println("Antrasis didžiausias: " + masyvas[masyvas.length - 2]);
    }

    public static void main(String[] args) {
        int[] masyvas = {4, 1, 7, 3, 9, 5};
        antrasisMinMax(masyvas);
    }
}