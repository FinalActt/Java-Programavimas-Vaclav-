public class uzd5 {
    private double suma = 0;
    private int tranzakcijuSkaicius = 0;
    private static final double MAKSIMALI_SUMA = 1000;

    public void idetiPinigus(double pinigai) {
        if (pinigai > 0 && suma + pinigai <= MAKSIMALI_SUMA) {
            suma += pinigai;
            tranzakcijuSkaicius++;
            System.out.println("Įdėta " + pinigai + " eurų. Bendra suma: " + suma + " eurų.");
        } else if (pinigai <= 0) {
            System.out.println("Negalima įdėti neigiamos arba nulinės sumos pinigų.");
        } else {
            System.out.println("Viršytas maksimalus leistinas pinigų kiekis. Negalima įdėti daugiau.");
        }
    }

    public void issimtiPinigus(double pinigai) {
        if (pinigai > 0 && pinigai <= suma) {
            suma -= pinigai;
            tranzakcijuSkaicius++;
            System.out.println("Išimta " + pinigai + " eurų. Bendra suma: " + suma + " eurų.");
        } else if (pinigai <= 0) {
            System.out.println("Negalima išimti neigiamos arba nulinės sumos pinigų.");
        } else {
            System.out.println("Nepakanka pinigų sąskaitoje. Negalima išimti daugiau negu yra.");
        }
    }

    public double vidutineSuma() {
        if (tranzakcijuSkaicius == 0) {
            System.out.println("Pinigų dėžutė yra tuščia. Nėra tranzakcijų.");
            return 0;
        }
        return suma / tranzakcijuSkaicius;
    }

    public static void main(String[] args) {
        uzd5 piniguDezute = new uzd5();

        piniguDezute.idetiPinigus(500);
        piniguDezute.idetiPinigus(300);
        piniguDezute.issimtiPinigus(150);

        System.out.println("Vidutinė suma: " + piniguDezute.vidutineSuma() + " eurų.");
    }
}
