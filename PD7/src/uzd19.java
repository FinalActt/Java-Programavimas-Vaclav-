import java.util.Scanner;

public class uzd19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Įveskite svorį (kg): ");
        double svoris = scanner.nextDouble();
        System.out.print("Įveskite ūgį (m): ");
        double ugis = scanner.nextDouble();

        double kmi = svoris / (ugis * ugis);

        // Format the KMI to display two decimal places
        String formattedKMI = String.format("%.2f", kmi);

        System.out.println("Kūno masės indeksas (KMI): " + formattedKMI);
    }
}