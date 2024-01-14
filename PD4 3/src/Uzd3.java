public class Uzd3 {
    public static void main(String[] args) {
        // Pavyzdiniai būlio kintamieji
        boolean tiesa = true;
        boolean melas = false;

        // && (ir) operatorius
        System.out.println("&& Operatorius:");
        System.out.println(tiesa && tiesa); // true
        System.out.println(tiesa && melas); // false
        System.out.println(melas && tiesa); // false
        System.out.println(melas && melas); // false

        // || (arba) operatorius
        System.out.println("\n|| Operatorius:");
        System.out.println(tiesa || tiesa); // true
        System.out.println(tiesa || melas); // true
        System.out.println(melas || tiesa); // true
        System.out.println(melas || melas); // false
    }
}
