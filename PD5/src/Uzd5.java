public class Uzd5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Patikriname, ar skaičius dalijasi iš 88
            if (i % 88 == 0) {
                break;
            }

            // Patikriname, ar skaičius dalijasi iš 5
            if (i % 5 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}
