public class Uzd2 {
    public static void main(String[] args) {
        // Deklaruojame byte ir short kintamuosius
        byte pirmasByte = 10;
        short antrasShort = 20;

        // Atliekame matematines operacijas
        int suma = pirmasByte + antrasShort;
        int skirtumas = antrasShort - pirmasByte;
        int sandauga = pirmasByte * antrasShort;
        double dalmuo = (double) antrasShort / pirmasByte;

        // Spausdiname rezultatus
        System.out.println("Suma: " + suma);
        System.out.println("Skirtumas: " + skirtumas);
        System.out.println("Sandauga: " + sandauga);
        System.out.println("Dalmuo: " + dalmuo);
    }
}
