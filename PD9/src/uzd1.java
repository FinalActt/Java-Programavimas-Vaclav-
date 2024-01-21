public class uzd1 {
    private final String numeris;
    private final String savininkas;
    private double balansas;

    public uzd1(String numeris, String savininkas, double pradinisBalansas) {
        this.numeris = numeris;
        this.savininkas = savininkas;
        this.balansas = pradinisBalansas;
    }

    public String getNumeris() {
        return numeris;
    }

    public String getSavininkas() {
        return savininkas;
    }

    public double getBalansas() {
        return balansas;
    }

    public boolean inestiPinigus(double suma) {
        if (suma > 0) {
            balansas += suma;
            System.out.println("Įnešimas sėkmingas. Naujas balansas: " + balansas);
            return true;
        } else {
            System.out.println("Negalima įnešti neigiamos sumos arba nulio.");
            return false;
        }
    }

    public boolean nuimtiPinigus(double suma) {
        if (suma > 0 && balansas >= suma) {
            balansas -= suma;
            System.out.println("Išėmimas sėkmingas. Naujas balansas: " + balansas);
            return true;
        } else {
            System.out.println("Negalima išimti neigiamos sumos arba suma viršija balansą.");
            return false;
        }
    }

    public static void main(String[] args) {
        // Pavyzdinė naudojimo situacija:
        uzd1 saskaita = new uzd1("LT123456789", "Jonas Jonaitis", 100.0);

        System.out.println("Sąskaitos numeris: " + saskaita.getNumeris());
        System.out.println("Savininkas: " + saskaita.getSavininkas());
        System.out.println("Balansas: " + saskaita.getBalansas());

        saskaita.inestiPinigus(50.0);
        saskaita.nuimtiPinigus(30.0);
    }
}