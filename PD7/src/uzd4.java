public class uzd4 {
    public static int dbd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int result = dbd(36, 48);
        System.out.println("Rezultatas: " + result);
    }
}