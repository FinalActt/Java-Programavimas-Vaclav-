import java.util.Scanner;

public class Uzd11 {

    public static void main(String[] args) {
        // Scanner obj
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Kiek žuvų gyvena akvariume? ");
        int a = scanner.nextInt();

        System.out.print("Kiek žuvų į akvariumą įdedama kiekvieną dieną? ");
        int b = scanner.nextInt();

        System.out.print("Kiek dienų praėjo? ");
        int n = scanner.nextInt();

        int total =  a + (b*n);

        System.out.println("Po " + n + " dienų akvariume gyvens " + total + " žuvų.");
    }
}
