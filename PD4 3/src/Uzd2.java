import java.util.Scanner;
public class Uzd2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite pirmą skaičių: ");
        int skaicius1 = scanner.nextInt();

        System.out.print("Įveskite antrą skaičių: ");
        int skaicius2 = scanner.nextInt();

        // Palyginimo rezultatų spausdinimas
        System.out.println(skaicius1 + " == " + skaicius2 + ": " + (skaicius1 == skaicius2));
        System.out.println(skaicius1 + " != " + skaicius2 + ": " + (skaicius1 != skaicius2));
        System.out.println(skaicius1 + " > " + skaicius2 + ": " + (skaicius1 > skaicius2));
        System.out.println(skaicius1 + " < " + skaicius2 + ": " + (skaicius1 < skaicius2));
        System.out.println(skaicius1 + " >= " + skaicius2 + ": " + (skaicius1 >= skaicius2));
        System.out.println(skaicius1 + " <= " + skaicius2 + ": " + (skaicius1 <= skaicius2));

        scanner.close();
    }
}
