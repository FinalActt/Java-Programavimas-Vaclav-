public class Uzd6 {
    public static void main(String[] args) {
        // Pavyzdys su Integer kėvalu
        Integer intWrapper1 = new Integer(10);
        // Autoboxing - primityvinis int yra avtomatiškai apvalkomas į Integer objektą
        Integer intWrapper2 = 20;

        // Unboxing - Integer objektai yra automatiškai konvertuojami į primityvius int
        int sum = intWrapper1 + intWrapper2;

        System.out.println("Suma: " + sum);

        // Pavyzdys su Double kėvalu
        Double doubleWrapper1 = new Double(3.14);
        Double doubleWrapper2 = 2.0;

        double product = doubleWrapper1 * doubleWrapper2;

        System.out.println("Produktas: " + product);
    }
}
