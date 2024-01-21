import java.util.Random;
import java.util.Scanner;

public class uzd20 {
    public static void main(String[] args) {
        Random random = new Random();
        int slaptasSkaicius = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int spejimas;

        do {
            System.out.print("Atspėkite skaičių nuo 1 iki 100: ");
            spejimas = scanner.nextInt();

            if (spejimas > slaptasSkaicius) {
                System.out.println("Slaptas skaičius yra mažesnis.");
            } else if (spejimas < slaptasSkaicius) {
                System.out.println("Slaptas skaičius yra didesnis.");
            } else {
                System.out.println("Sveikiname, atspėjote!");
            }
        } while (spejimas != slaptasSkaicius);
    }
}