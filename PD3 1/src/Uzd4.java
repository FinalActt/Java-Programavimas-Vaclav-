public class Uzd4 {
    public static void main(String[] args) {
        // Sukuriamas du boolean tipo kintamieji
        boolean pirmasKintamasis = true;
        boolean antrasKintamasis = false;

        // Loginė operacija AND
        boolean rezultatasAND = pirmasKintamasis && antrasKintamasis;
        System.out.println("AND rezultatas: " + rezultatasAND);

        // Loginė operacija OR
        boolean rezultatasOR = pirmasKintamasis || antrasKintamasis;
        System.out.println("OR rezultatas: " + rezultatasOR);

        // Loginė operacija NOT
        boolean rezultatasNOT = !pirmasKintamasis;
        System.out.println("NOT rezultatas: " + rezultatasNOT);
    }
}
