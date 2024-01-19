import java.text.DecimalFormat;

public class Uzd20 {
    public static void main(String[] args) {
        double[] duomenys = {824.25, 1225.12, 459.16, 1500};

        double[] rezultatai = skaiciuotiNaujusAtlyginimus(duomenys);

        System.out.print("Atlyginimas iki: ");
        spausdintiMasyva(duomenys);

        System.out.print("Atlyginimas po: ");
        spausdintiMasyva(rezultatai);
    }

    public static double[] skaiciuotiNaujusAtlyginimus(double[] atlyginimai) {
        double[] naujiAtlyginimai = new double[atlyginimai.length];

        for (int i = 0; i < atlyginimai.length; i++) {
            if (atlyginimai[i] > 1000) {
                naujiAtlyginimai[i] = atlyginimai[i] * 1.05;
            } else {
                naujiAtlyginimai[i] = atlyginimai[i] * 1.10;
            }
        }

        return naujiAtlyginimai;
    }

    public static void spausdintiMasyva(double[] masyvas) {
        DecimalFormat df = new DecimalFormat("#.##");
        for (int i = 0; i < masyvas.length; i++) {
            System.out.print(formatToTwoDecimalPlaces(masyvas[i]));
            if (i < masyvas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static String formatToTwoDecimalPlaces(double value) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(value);
    }
}