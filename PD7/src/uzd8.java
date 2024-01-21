public class uzd8 {
    public static boolean arPalindromas(String tekstas) {
        String atvirkstinis = new StringBuilder(tekstas).reverse().toString();
        return tekstas.equals(atvirkstinis);
    }

    public static void main(String[] args) {
        boolean result = arPalindromas("level");
        System.out.println("Rezultatas: " + result);
    }
}