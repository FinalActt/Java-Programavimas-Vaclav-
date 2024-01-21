import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Preke {
    private String pavadinimas;
    private double kaina;

    public Preke(String pavadinimas, double kaina) {
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public double getKaina() {
        return kaina;
    }
}

class Parduotuve {
    private Map<Preke, Integer> prekiuKrepselis = new HashMap<>();
    private double pvmTarifas = 0.21; // PVM tarifas 21%

    public void pridetiPreke(Preke preke, int kiekis) {
        prekiuKrepselis.put(preke, prekiuKrepselis.getOrDefault(preke, 0) + kiekis);
    }

    public double gautiBendraKrepselioKaina() {
        double bendraKaina = 0;
        for (Map.Entry<Preke, Integer> entry : prekiuKrepselis.entrySet()) {
            Preke preke = entry.getKey();
            int kiekis = entry.getValue();
            bendraKaina += preke.getKaina() * kiekis;
        }
        return bendraKaina;
    }

    public double gautiBendraKrepselioKainaSuPVM() {
        return gautiBendraKrepselioKaina() * (1 + pvmTarifas);
    }

    public double gautiKrepselioKainaUSD(double eurUsdKursas) {
        return gautiBendraKrepselioKainaSuPVM() * eurUsdKursas;
    }

    public void pritaikytiNuolaida(double nuolaidaProcentais) {
        double nuolaidaKoeficientas = 1 - nuolaidaProcentais / 100;
        for (Map.Entry<Preke, Integer> entry : prekiuKrepselis.entrySet()) {
            Preke preke = entry.getKey();
            int kiekis = entry.getValue();
            double naujaKaina = preke.getKaina() * nuolaidaKoeficientas;
            preke = new Preke(preke.getPavadinimas(), naujaKaina);
            prekiuKrepselis.put(preke, kiekis);
        }
    }
}

public class uzd2 {
    public static void main(String[] args) {

        Preke maistoPreke = new Preke("Duona", 1.5);
        Preke alkoholis = new Preke("Vynas", 10.0);
        Preke knyga = new Preke("Java Programming", 25.0);


        Parduotuve parduotuve = new Parduotuve();


        parduotuve.pridetiPreke(maistoPreke, 2);
        parduotuve.pridetiPreke(alkoholis, 1);
        parduotuve.pridetiPreke(knyga, 1);


        double bendraKaina = parduotuve.gautiBendraKrepselioKaina();
        double bendraKainaSuPVM = parduotuve.gautiBendraKrepselioKainaSuPVM();
        double kainaUSD = parduotuve.gautiKrepselioKainaUSD(1.2); // Pavyzdinis eur/usd kursas


        System.out.println("Bendra krepšelio kaina: " + bendraKaina);
        System.out.println("Bendra krepšelio kaina su PVM: " + bendraKainaSuPVM);
        System.out.printf("Krepšelio kaina doleriais: $%.2f\n", kainaUSD);
    }
}