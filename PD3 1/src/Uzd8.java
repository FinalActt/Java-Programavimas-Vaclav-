public class Uzd8 {
    public static void main(String[] args) {
        // Apskaičiuojame išraiškos rezultatą
        double result = (7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5) / (15.4 - 2.75);

        // Tikriname, ar rezultatas yra lygus 12.78
        boolean isResultCorrect = Math.abs(result - 12.78) < 0.0001;

        // Spausdiname rezultatą ir patikrinimo rezultatą
        System.out.println("Išraiškos rezultatas: " + result);
        System.out.println("Ar rezultatas yra lygus 12.78? " + isResultCorrect);
    }
}
