import java.util.Scanner;

public class Uzd6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kiek eglučių atvežta? ");
        int eglSk = scanner.nextInt();

        int egAuk, sum = 0;
        for (int i = 1; i <= eglSk; i++)
        {
            System.out.print("Įveskite " + i + " eglutės aukštį:");
            egAuk = scanner.nextInt();

            sum += egAuk;
        }

        System.out.println("Eglutės aukščio vidurkis: " + (float) sum/eglSk + " cm.");
    }
}
