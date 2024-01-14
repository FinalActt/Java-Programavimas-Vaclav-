public class Uzd3 {
    public static void main(String[] args) {
        // float ir double kintamieji su nedidelėmis reikšmėmis
        float floatReiksme1 = 0.1f;
        double doubleReiksme1 = 0.1;

        // float ir double kintamieji su didelėmis reikšmėmis
        float floatReiksme2 = 123456789.123456789f;
        double doubleReiksme2 = 123456789.123456789;

        // Atlikime skaičiavimus
        float sumaFloat = floatReiksme1 + floatReiksme2;
        double sumaDouble = doubleReiksme1 + doubleReiksme2;

        // Spausdiname rezultatus
        System.out.println("float suma: " + sumaFloat);
        System.out.println("double suma: " + sumaDouble);
    }
}
