import java.util.Scanner;

public class Uzd7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] paskaitos = new int[5];
        String[] savaitesDienos = {"Pirmadienis", "Antradienis", "Trečiadienis", "Ketvirtadienis", "Penktadienis"};

        // Įvedimas
        for (int i = 0; i < 5; i++) {
            System.out.print("Įveskite paskaitų skaičių " + savaitesDienos[i] + ": ");
            paskaitos[i] = scanner.nextInt();
        }

        // Skaičiavimai
        int sumaPaskaitu = 0;
        for (int paskaituSkaicius : paskaitos) {
            sumaPaskaitu += paskaituSkaicius;
        }


        int sumaMinuciu = sumaPaskaitu * 45;

        // Rezultato spausdinimas
        System.out.println("Paskaitų skaičius per savaitę - " + sumaPaskaitu);
        System.out.println("Tai sudaro " + sumaMinuciu + " minučių.");

        // Uždarome skenerį
        scanner.close();
    }
}
