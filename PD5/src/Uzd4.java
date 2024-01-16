import java.util.Scanner;

public class Uzd4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int sk;

        do {
            System.out.print("Įveskite skaičių (0 nutrauks programą): ");
            sk = scanner.nextInt();
            sum += sk;
        } while (sk != 0);

        System.out.println("Visų įvestų skaičių suma: " + sum);

        scanner.close();
    }
}