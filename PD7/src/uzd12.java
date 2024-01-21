public class uzd12 {
    public static boolean arPirminis(int skaicius) {
        if (skaicius <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(skaicius); i++) {
            if (skaicius % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = arPirminis(13);
        System.out.println("Rezultatas: " + result);
    }
}