public class Automobilis {
    // Kintamieji
    private String marke;
    private String modelis;
    private int metai;

    // Konstruktorius
    public Automobilis(String marke, String modelis, int metai) {
        this.marke = marke;
        this.modelis = modelis;
        this.metai = metai;
    }

    // Getteriai
    public String getMarke() {
        return marke;
    }

    public String getModelis() {
        return modelis;
    }

    public int getMetai() {
        return metai;
    }

    // Setteriai
    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setModelis(String modelis) {
        this.modelis = modelis;
    }

    public void setMetai(int metai) {
        this.metai = metai;
    }

    // displayInfo metodas
    public void displayInfo() {
        System.out.println("Markė: " + marke);
        System.out.println("Modelis: " + modelis);
        System.out.println("Metai: " + metai);
    }

    // Pagrindinė klasė testavimui
    public static void main(String[] args) {
        // Sukuriamas automobilis
        Automobilis automobilis = new Automobilis("Toyota", "Camry", 2022);

        // Spausdinama informacija apie automobilį
        automobilis.displayInfo();
    }
}