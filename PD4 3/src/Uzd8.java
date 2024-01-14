import java.util.Scanner;

public class Uzd8 {

    public static void main(String[] args) {
        // Scanner objektas
        Scanner scanner = new Scanner(System.in);

        // Įvedami duomenys
        System.out.print("Sienos ilgis m: ");
        int a = scanner.nextInt();

        System.out.print("Sienos aukštis m: ");
        int h = scanner.nextInt();

        System.out.print("Plytos kaina Eur: ");
        double k = scanner.nextDouble();

        // Skaičiuojamos plytų reikiamos kiekis
        int plytosKiekis = (int) Math.ceil((double) (a * h) / (0.2 * 0.1));

        // Skaičiuojama plytų kaina
        double plytuKaina = plytosKiekis * k;

        // Spausdinami rezultatai
        System.out.println("Plytų kiekis " + plytosKiekis);
        System.out.printf("Plytos kainuos %.2f Eur%n", plytuKaina);
    }
}
