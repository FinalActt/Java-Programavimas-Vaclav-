public class uzd6 {
    public static int skaiciuotiRaidziuSkaiciu(String eilute) {
        return eilute.length();
    }

    public static void main(String[] args) {
        int result = skaiciuotiRaidziuSkaiciu("Hello, World!");
        System.out.println("Rezultatas: " + result);
    }
}