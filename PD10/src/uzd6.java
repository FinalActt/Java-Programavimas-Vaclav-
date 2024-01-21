import java.util.ArrayList;

class Preke_ {
    private String pavadinimas;
    private double kaina;
    private int kiekis;

    public Preke_(String pavadinimas, double kaina, int kiekis) {
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
        this.kiekis = kiekis;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public double getKaina() {
        return kaina;
    }

    public int getKiekis() {
        return kiekis;
    }

    public double getVisosKainosSumaSuPVM() {
        double pvmTarifas = 0.21;
        return kaina * kiekis * (1 + pvmTarifas);
    }

    public void decreaseKiekis(int amount) {
        this.kiekis -= amount;
    }

    @Override
    public String toString() {
        return pavadinimas + " - Kaina: " + kaina + " EUR, Kiekis: " + kiekis;
    }
}

class Sandelis {
    private ArrayList<Preke_> prekiuSarasas = new ArrayList<>();

    public void priimtiPreke(Preke_ preke) {
        prekiuSarasas.add(preke);
    }

    public void isduotiPreke(String pavadinimas, int kiekis) {
        for (Preke_ preke : prekiuSarasas) {
            if (preke.getPavadinimas().equals(pavadinimas)) {
                if (preke.getKiekis() >= kiekis) {
                    preke.decreaseKiekis(kiekis);
                    System.out.println("Prekė isduota: " + preke);
                } else {
                    System.out.println("Nepakanka prekių sandėlyje.");
                }
                return;
            }
        }
        System.out.println("Prekė nerasta sandėlyje.");
    }

    public double gautiVisuPrekiuKainaSuPVM() {
        double suma = 0;
        for (Preke_ preke : prekiuSarasas) {
            suma += preke.getVisosKainosSumaSuPVM();
        }
        return suma;
    }

    public void rodytiSandeli() {
        System.out.println("Sandėlyje esančios prekės:");
        for (Preke_ preke : prekiuSarasas) {
            System.out.println(preke);
        }
        System.out.println("Bendra visų prekių kaina su PVM: " + gautiVisuPrekiuKainaSuPVM() + " EUR");
    }
}

public class uzd6 {
    public static void main(String[] args) {
        Sandelis sandelis = new Sandelis();

        Preke_ preke1 = new Preke_("Laptopas", 800, 5);
        Preke_ preke2 = new Preke_("Telefonas", 500, 10);

        sandelis.priimtiPreke(preke1);
        sandelis.priimtiPreke(preke2);

        sandelis.rodytiSandeli();

        sandelis.isduotiPreke("Laptopas", 2);
        sandelis.isduotiPreke("Telefonas", 12);

        sandelis.rodytiSandeli();
    }
}