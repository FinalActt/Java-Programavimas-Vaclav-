import java.util.Scanner;
public class Uzd5 {
    public static void main(String[] args) {
        // Sukuriamas Scanner objektas skaitymui įvesties
        Scanner scanner = new Scanner(System.in);

        // Įvedamas skaičius iš naudotojo
        System.out.print("Įveskite skaičių: ");
        int skaicius = scanner.nextInt();

        // Ternary operatorius patikrina, ar skaičius yra teigiamas ar neigiamas
        String rezultatas = (skaicius >= 0) ? "Teigiamas" : "Neigiamas";

        // Atspausdinamas rezultatas
        System.out.println("Skaičius yra " + rezultatas);

        // Uždaromas Scanner objektas
        scanner.close();
    }
}
