import java.util.Scanner;

public class Uzd9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite puodelių skaičių:");
        int puodeliuSkaicius = scanner.nextInt();

        // Apskaičiuojame pilnas dėžutes
        int pilnosDezutes = puodeliuSkaicius / 3;

        // Apskaičiuojame nesupakuotus puodelius
        int nesupakuotiPuodeliai = puodeliuSkaicius % 3;

        System.out.println("Pilnų dėžučių skaičius: " + pilnosDezutes);
        System.out.println("Nesupakuotų puodelių skaičius: " + nesupakuotiPuodeliai);
    }
}
