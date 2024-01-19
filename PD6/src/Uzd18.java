import java.util.ArrayList;
import java.util.HashSet;

public class Uzd18 {
    public static void main(String[] args) {
        // Duomenys
        int[] masyvas1 = {23, 45, 12, 3, 78, 98, 15, -3};
        int[] masyvas2 = {2, 12, 24, 15, 48, 64, -5, 65};

        // Atrinktų skaičių masyvas
        ArrayList<Integer> atrinktasMasyvas = atrinktiSkaičius(masyvas1, masyvas2);

        // Spausdinimas
        System.out.print("Pradinis masyvas Nr. 1: ");
        spausdintiMasyva(masyvas1);

        System.out.print("Pradinis masyvas Nr. 2: ");
        spausdintiMasyva(masyvas2);

        System.out.print("Atrinktų skaičių masyvas: ");
        spausdintiMasyva(atrinktasMasyvas);
    }

    // Metodas atrinktiSkaičius
    public static ArrayList<Integer> atrinktiSkaičius(int[] masyvas1, int[] masyvas2) {
        // Sukuriame HashSet'ą masyvui1, kad patikrintume pasikartojančius skaičius
        HashSet<Integer> pasikartojantys = new HashSet<>();
        for (int skaicius : masyvas1) {
            pasikartojantys.add(skaicius);
        }

        // Sukuriame ArrayList'ą atrinktiems skaičiams
        ArrayList<Integer> atrinktasMasyvas = new ArrayList<>();
        for (int skaicius : masyvas2) {
            // Tikriname, ar skaičius nepasikartoja masyve1
            if (!pasikartojantys.contains(skaicius)) {
                atrinktasMasyvas.add(skaicius);
            }
        }

        return atrinktasMasyvas;
    }

    // Metodas spausdintiMasyva
    public static void spausdintiMasyva(int[] masyvas) {
        for (int skaicius : masyvas) {
            System.out.print(skaicius + ",");
        }
        System.out.println();
    }

    // Metodas spausdintiMasyva
    public static void spausdintiMasyva(ArrayList<Integer> masyvas) {
        for (int skaicius : masyvas) {
            System.out.print(skaicius + ",");
        }
        System.out.println();
    }
}