import java.util.Scanner;

public class Uzd10 {

    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Įveskite automobilio greitį km/h: ");
        double greitisKMH = scanner.nextDouble();

        // Convert km/h to m/s
        double greitisMS = greitisKMH * 1000 / 3600;

        // Tunnel length
        int tunnelIlgis = 264;

        double laikas = tunnelIlgis / greitisMS;

        System.out.printf("Automobilis tunelį pravažiuos per %.2f s%n", laikas);

    }
}
