public class uzd2 {
    public static double celsijusIFarenheitas(double celsijus) {
        return (celsijus * 9/5) + 32;
    }

    public static void main(String[] args) {
        double result = celsijusIFarenheitas(25);
        System.out.println("Rezultatas: " + result);
    }
}