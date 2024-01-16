public class Uzd3 {
    public static void main(String[] args) {
        int n = 50; // Pakeiskite šią reikšmę pagal poreikį
        int i = 2;

        System.out.println("Pirminiai skaičiai naudojant while ciklą iki " + n + ":");
        while (i <= n) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}