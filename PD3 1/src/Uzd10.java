import java.util.Scanner;

public class Uzd10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite skaičius atskirtus tarpais: ");
        String inputLine = scanner.nextLine();

        // Skaidome įvestą eilutę į skaičius, naudodami tarpą kaip skyriklį
        String[] skaiciai = inputLine.split(" ");

        int suma = 0;

        // Einame per visus gautus skaičius ir juos pridedame prie sumos
        for (String skaiciusString : skaiciai) {
            try {
                int skaicius = Integer.parseInt(skaiciusString);
                suma += skaicius;
            } catch (NumberFormatException e) {
                System.out.println("Klaida konvertuojant skaičių: " + skaiciusString);
            }
        }

        // Spausdiname gautą sumą
        System.out.println("Suma: " + suma);

        // Uždarome scanner
        scanner.close();
    }
}
