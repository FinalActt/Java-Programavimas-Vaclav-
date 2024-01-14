public class Uzd4 {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;

        // Priskyrimo operatorius (=)
        System.out.println("Priskyrimo operatorius (=):");
        System.out.println("x = " + x);

        // Sujungimo priskyrimo operatorius (+=)
        x += y;
        System.out.println("\nSujungimo priskyrimo operatorius (+=):");
        System.out.println("x += y -> x = " + x);

        // Atimties priskyrimo operatorius (-=)
        x -= y;
        System.out.println("\nAtimties priskyrimo operatorius (-=):");
        System.out.println("x -= y -> x = " + x);

        // Daugybos priskyrimo operatorius (*=)
        x *= y;
        System.out.println("\nDaugybos priskyrimo operatorius (*=):");
        System.out.println("x *= y -> x = " + x);

        // Dalybos priskyrimo operatorius (/=)
        x /= y;
        System.out.println("\nDalybos priskyrimo operatorius (/=):");
        System.out.println("x /= y -> x = " + x);

        // Liekanos priskyrimo operatorius (%=)
        x %= y;
        System.out.println("\nLiekanos priskyrimo operatorius (%=):");
        System.out.println("x %= y -> x = " + x);
    }
}
