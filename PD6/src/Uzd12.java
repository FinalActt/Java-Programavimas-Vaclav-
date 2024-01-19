public class Uzd12 {
    public static void main(String[] args) {
        // Duotas masyvas
        int[] masyvas = {5, -3, 8, -2, 0, -7, 1, -4};

        // Kvietimas funkcijai, kuri suskaičiuoja neigiamus skaičius
        int neigiamiSkaiciai = skaiciuotiNeigiamus(masyvas);

        // Rezultato spausdinimas
        System.out.println("Neigiamų skaičių kiekis: " + neigiamiSkaiciai);
    }

    // Funkcija, kuri suskaičiuoja neigiamus skaičius masyve
    public static int skaiciuotiNeigiamus(int[] masyvas) {
        int neigiamiSkaiciai = 0;

        // Eina per visus masyvo elementus
        for (int skaicius : masyvas) {
            // Tikrina, ar skaičius yra neigiamas
            if (skaicius < 0) {
                neigiamiSkaiciai++;
            }
        }

        // Grąžina neigiamų skaičių kiekį
        return neigiamiSkaiciai;
    }
}