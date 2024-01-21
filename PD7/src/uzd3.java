public class uzd3 {
    public static double trikampioPlotas(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        double result = trikampioPlotas(3, 4, 5);
        System.out.println("Rezultatas: " + result);
    }
}