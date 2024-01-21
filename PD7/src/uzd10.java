public class uzd10 {
    public static String konvertuotiPirmasiasRaides(String eilute) {
        String[] zodziai = eilute.split(" ");
        for (int i = 0; i < zodziai.length; i++) {
            if (!zodziai[i].isEmpty()) {
                char pirmaRaide = Character.toUpperCase(zodziai[i].charAt(0));
                zodziai[i] = pirmaRaide + zodziai[i].substring(1);
            }
        }
        return String.join(" ", zodziai);
    }

    public static void main(String[] args) {
        String result = konvertuotiPirmasiasRaides("java yra galinga kalba");
        System.out.println("Rezultatas: " + result);
    }
}