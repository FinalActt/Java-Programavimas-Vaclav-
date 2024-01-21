public class uzd13 {
    public static String gautiTipoPavadinima(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static void main(String[] args) {
        String result = gautiTipoPavadinima(42);
        System.out.println("Rezultatas: " + result);
    }
}