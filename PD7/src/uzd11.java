public class uzd11 {
    public static String ilgiausiasZodis(String eilute) {
        String[] zodziai = eilute.split(" ");
        String ilgiausias = "";
        for (String zodis : zodziai) {
            if (zodis.length() > ilgiausias.length()) {
                ilgiausias = zodis;
            }
        }
        return ilgiausias;
    }

    public static void main(String[] args) {
        String result = ilgiausiasZodis("Java yra programavimo kalba");
        System.out.println("Rezultatas: " + result);
    }
}