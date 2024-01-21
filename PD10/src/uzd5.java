import java.util.ArrayList;
import java.util.Scanner;

class Preke {
    private int id;
    private String pavadinimas;

    public Preke(int id, String pavadinimas) {
        this.id = id;
        this.pavadinimas = pavadinimas;
    }

    public int getId() {
        return id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }
}

class PrekiuRegistras {
    private ArrayList<Preke> prekiuSarasas;

    public PrekiuRegistras() {
        this.prekiuSarasas = new ArrayList<>();
    }

    public void pridetiPreke(Preke preke) {
        if (!prekiuSarasas.contains(preke)) {
            prekiuSarasas.add(preke);
            System.out.println("Prekė pridėta sėkmingai.");
        } else {
            System.out.println("Prekė su tokiu ID jau yra užregistruota.");
        }
    }

    public Preke rastiPrekePagalId(int id) {
        for (Preke preke : prekiuSarasas) {
            if (preke.getId() == id) {
                return preke;
            }
        }
        return null;
    }
}

public class uzd5 {
    public static void main(String[] args) {
        PrekiuRegistras prekiuRegistras = new PrekiuRegistras();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pasirinkite veiksmą:");
            System.out.println("1. Pridėti prekę");
            System.out.println("2. Ieškoti prekės pagal ID");
            System.out.println("0. Baigti programą");

            int veiksmas = scanner.nextInt();

            switch (veiksmas) {
                case 1:
                    System.out.println("Įveskite prekės ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Nuskaitome likusią eilutę
                    System.out.println("Įveskite prekės pavadinimą:");
                    String pavadinimas = scanner.nextLine();

                    Preke naujaPreke = new Preke(id, pavadinimas);
                    prekiuRegistras.pridetiPreke(naujaPreke);
                    break;
                case 2:
                    System.out.println("Įveskite prekės ID, kurią norite rasti:");
                    int rastaId = scanner.nextInt();
                    Preke rastaPreke = prekiuRegistras.rastiPrekePagalId(rastaId);

                    if (rastaPreke != null) {
                        System.out.println("Rasta prekė: ID = " + rastaPreke.getId() + ", Pavadinimas = " + rastaPreke.getPavadinimas());
                    } else {
                        System.out.println("Prekė su tokiu ID nerasta.");
                    }
                    break;
                case 0:
                    System.out.println("Programa baigta.");
                    System.exit(0);
                default:
                    System.out.println("Neteisingas veiksmas. Bandykite dar kartą.");
                    break;
            }
        }
    }
}
