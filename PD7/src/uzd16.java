public class uzd16 {
    public static boolean arTobulas(int skaicius) {
        int suma = 1;
        for (int i = 2; i <= skaicius / 2; i++) {
            if (skaicius % i == 0) {
                suma += i;
            }
        }
        return suma == skaicius;
    }

    public static void main(String[] args) {
        boolean result = arTobulas(28);
        System.out.println("Rezultatas: " + result);
    }
}