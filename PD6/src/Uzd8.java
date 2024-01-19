import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Uzd8 {
    public static void main(String[] args) {
        // Pavyzdinis masyvas
        String[] masyvas = {"a", "B", "c", "a", "d", "C", "b"};

        // Pašaliname pasikartojančius elementus
        String[] rezultatas = pašalintiPasikartojimus(masyvas);

        // Spausdiname rezultatą
        System.out.print("Pradinis masyvas: ");
        spausdintiMasyva(masyvas);

        System.out.print("Masyvas be pasikartojimų: ");
        spausdintiMasyva(rezultatas);
    }

    private static String[] pašalintiPasikartojimus(String[] masyvas) {
        // Sukuriame HashSet'ą, kuriame saugosime unikalius elementus
        HashSet<String> unikaliosReiksmes = new HashSet<>();

        // Sukuriame sąrašą rezultatui
        List<String> rezultatas = new ArrayList<>();

        // Iteruojame per pradinį masyvą
        for (String elementas : masyvas) {
            // Konvertuojame į mažąsias raidžias ir pašaliname tarpus
            String valanda = elementas.toLowerCase().trim();

            // Tikriname, ar ši reikšmė jau yra HashSet'e
            if (!unikaliosReiksmes.contains(valanda)) {
                // Jei ne, pridedame ją į HashSet'ą ir rezultato sąrašą
                unikaliosReiksmes.add(valanda);
                rezultatas.add(elementas);
            }
        }

        // Konvertuojame rezultato sąrašą į masyvą
        return rezultatas.toArray(new String[0]);
    }

    private static void spausdintiMasyva(String[] masyvas) {
        for (String elementas : masyvas) {
            System.out.print(elementas + " ");
        }
        System.out.println();
    }
}