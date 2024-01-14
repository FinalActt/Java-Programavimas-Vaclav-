public class Uzd7 {
    public static void main(String[] args) {
        // Deklaruojame String kintamuosius
        String firstString = "Labas";
        String secondString = "rytas";

        // Sujungimo (konkatenacijos) operacija
        String resultConcatenation = firstString + " " + secondString;
        System.out.println("Sujungimas: " + resultConcatenation);

        // Palyginimo operacija
        boolean areEqual = firstString.equals(secondString);
        System.out.println("Palyginimas: " + areEqual);

        // Dalies ištraukimo operacija
        String substring = firstString.substring(0, 3);
        System.out.println("Dalies ištraukimas: " + substring);

        // Kitos operacijos, pvz., ilgis, didžiosios/mažosios raidės
        int length = secondString.length();
        System.out.println("String ilgis: " + length);

        String uppercase = firstString.toUpperCase();
        System.out.println("Didžiosios raidės: " + uppercase);

        String lowercase = secondString.toLowerCase();
        System.out.println("Mažosios raidės: " + lowercase);
    }
}
