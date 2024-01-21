public class uzd5 {
    public static long faktorialas(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * faktorialas(n - 1);
    }

    public static void main(String[] args) {
        long result = faktorialas(5);
        System.out.println("Rezultatas: " + result);
    }
}