public class uzd7 {
    public static int apverstiSkaiciu(int skaicius) {
        int apverstas = 0;
        while (skaicius != 0) {
            apverstas = apverstas * 10 + skaicius % 10;
            skaicius = skaicius / 10;
        }
        return apverstas;
    }

    public static void main(String[] args) {
        int result = apverstiSkaiciu(45);
        System.out.println("Rezultatas: " + result);
    }
}