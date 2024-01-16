public class Uzd2 {

    public static void main(String[] args) {
        // Ciklas, kuris eina per daugybos lentelės eilutes
        for (int i = 1; i <= 10; i++) {
            // Ciklas, kuris eina per kiekvieną stulpelį eilutėje
            for (int j = 1; j <= 10; j++) {
                // Spausdiname daugybos rezultata
                System.out.print(i * j + "\t");
            }

            System.out.println();
        }
    }
}
