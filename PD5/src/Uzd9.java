import java.util.Scanner;

public class Uzd9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite autobusų skaičių: ");
        int n = scanner.nextInt();

        int bendrasKeleiviuSkaicius = 0;
        int bendrasLaikasMinutemis = 0;
        int maziauNei10KeleiviuAutobusai = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Autobusas " + i + ":");
            System.out.print("  Važiavimo laikas (val.): ");
            int valandos = scanner.nextInt();
            System.out.print("  Važiavimo laikas (min.): ");
            int minutes = scanner.nextInt();
            System.out.print("  Pervežė keleivių: ");
            int keleiviai = scanner.nextInt();

            int laikasMinutemis = valandos * 60 + minutes;
            bendrasLaikasMinutemis += laikasMinutemis;
            bendrasKeleiviuSkaicius += keleiviai;

            if (keleiviai < 10) {
                maziauNei10KeleiviuAutobusai++;
            }
        }

        // (a) kiek keleivių pervežė visi autobusai
        System.out.println("Bendrai pervežtų keleivių skaičius = " + bendrasKeleiviuSkaicius);

        // (b) vidutinio sugaišto važiavimo laiko skaičiavimas
        int vidutinisLaikasMinutemis = bendrasLaikasMinutemis / n;
        System.out.println("Vidutinis sugaištas važiavimo laikas (min.): " + vidutinisLaikasMinutemis);

        // (c) keliuose autobusuose mažiau nei 10 keleivių
        System.out.println("Autobusų skaičius (keleiviai < 10): " + maziauNei10KeleiviuAutobusai);

        scanner.close();
    }
}
