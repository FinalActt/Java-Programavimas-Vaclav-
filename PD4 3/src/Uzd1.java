
import java.util.Scanner;

public class Uzd1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Įvesties kintamieji
        System.out.print("Įveskite pirmąjį skaičių: ");
        double skaicius1 = scanner.nextDouble();

        System.out.print("Įveskite antrąjį skaičių: ");
        double skaicius2 = scanner.nextDouble();

        // Aritmetinės operacijos
        double suma = skaicius1 + skaicius2;
        double skirtumas = skaicius1 - skaicius2;
        double sandauga = skaicius1 * skaicius2;

        // Tikriname, ar antrasis skaičius nėra nulis, prieš atliekant dalybą
        double dalmuo = (skaicius2 != 0) ? (skaicius1 / skaicius2) : Double.POSITIVE_INFINITY;

        double liekana = skaicius1 % skaicius2;

        // Spausdiname rezultatus
        System.out.println("Suma: " + suma);
        System.out.println("Skirtumas: " + skirtumas);
        System.out.println("Sandauga: " + sandauga);

        // Tikriname, ar dalybos rezultatas yra baigtinė reikšmė
        if (Double.isFinite(dalmuo)) {
            System.out.println("Dalmuo: " + dalmuo);
        } else {
            System.out.println("Dalyba iš nulio negalima.");
        }

        System.out.println("Liekana: " + liekana);

        // Uždarome scanner
        scanner.close();
    }
}
