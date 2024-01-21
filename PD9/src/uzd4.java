import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Knyga {
    private String pavadinimas;
    private String autorius;
    private String isbn;
    private int isleidimoMetai;

    public Knyga(String pavadinimas, String autorius, String isbn, int isleidimoMetai) {
        this.pavadinimas = pavadinimas;
        this.autorius = autorius;
        this.isbn = isbn;
        this.isleidimoMetai = isleidimoMetai;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public String getAutorius() {
        return autorius;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getIsleidimoMetai() {
        return isleidimoMetai;
    }
}

class Skaitytojas {
    private String vardas;
    private String pavarde;
    private int gimimoMetai;

    public Skaitytojas(String vardas, String pavarde, int gimimoMetai) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.gimimoMetai = gimimoMetai;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public int getGimimoMetai() {
        return gimimoMetai;
    }
}

class Biblioteka {
    private Map<String, List<Knyga>> knyguKatalogas;
    private List<Skaitytojas> skaitytojai;
    private Map<Skaitytojas, List<Knyga>> iskolinimai;

    public Biblioteka() {
        knyguKatalogas = new HashMap<>();
        skaitytojai = new ArrayList<>();
        iskolinimai = new HashMap<>();
    }

    public void pridetiKnygaIKataloga(String zanras, Knyga knyga) {
        knyguKatalogas.computeIfAbsent(zanras, k -> new ArrayList<>()).add(knyga);
    }

    public void registruotiSkaitytoja(Skaitytojas skaitytojas) {
        skaitytojai.add(skaitytojas);
    }

    public void isiskolintiKnyga(Skaitytojas skaitytojas, Knyga knyga) {
        if (skaitytojai.contains(skaitytojas) && knyguKatalogas.values().stream().anyMatch(list -> list.contains(knyga))) {
            iskolinimai.computeIfAbsent(skaitytojas, k -> new ArrayList<>()).add(knyga);
            System.out.println("Knyga " + knyga.getPavadinimas() + " paskolinta skaitytojui " + skaitytojas.getVardas() + " " + skaitytojas.getPavarde());
        } else {
            System.out.println("Skaitytojas arba knyga neegzistuoja!");
        }
    }

    public void tikrintiKnyguGrąžinima() {
        for (Skaitytojas skaitytojas : iskolinimai.keySet()) {
            List<Knyga> iskoltosKnygos = iskolinimai.get(skaitytojas);
            for (Knyga knyga : iskoltosKnygos) {
                if (isVėluojamaGrąžinti(knyga)) {
                    System.out.println("Vėluojama grąžinti knygą " + knyga.getPavadinimas() + " skaitytojo " +
                            skaitytojas.getVardas() + " " + skaitytojas.getPavarde() + ". Bauda skaičiuojama...");
                } else {
                    System.out.println("Knyga " + knyga.getPavadinimas() + " grąžinta laiku.");
                }
            }
        }
    }

    private boolean isVėluojamaGrąžinti(Knyga knyga) {
        return knyga.getIsleidimoMetai() < 2022;
    }
}

public class uzd4 {
    public static void main(String[] args) {
        Biblioteka biblioteka = new Biblioteka();

        Knyga knyga1 = new Knyga("Pavadinimas1", "Autorius1", "ISBN1", 2020);
        Knyga knyga2 = new Knyga("Pavadinimas2", "Autorius2", "ISBN2", 2021);
        biblioteka.pridetiKnygaIKataloga("Literatūra", knyga1);
        biblioteka.pridetiKnygaIKataloga("Literatūra", knyga2);

        Skaitytojas skaitytojas = new Skaitytojas("Vardas", "Pavarde", 1990);
        biblioteka.registruotiSkaitytoja(skaitytojas);

        biblioteka.isiskolintiKnyga(skaitytojas, knyga1);

        biblioteka.tikrintiKnyguGrąžinima();
    }
}