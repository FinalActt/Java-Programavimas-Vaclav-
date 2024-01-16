import java.util.Scanner;

public class Uzd8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite kuro bako talpą (litrais): ");
        int talpa = scanner.nextInt();

        System.out.print("Įveskite kuro sąnaudas n (litrais): ");
        int n = scanner.nextInt();

        scanner.close();

        int dienos = 0;
        int likoDegalu = talpa;

        while (likoDegalu >= 0) {
            if (dienos % 2 == 0) {
                // Lyginė diena
                likoDegalu -= n;
            } else {
                // Nelyginė diena
                likoDegalu -= 2 * n;
            }

            if (likoDegalu >= 0) {
                dienos++;
            }
        }

        System.out.println("Keliauti bus galima " + dienos + " dienas.");
    }
}