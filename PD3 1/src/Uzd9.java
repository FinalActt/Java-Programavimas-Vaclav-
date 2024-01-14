public class Uzd9 {
    public static void main(String[] args) {
        // Autoboxing: primityvus tipas -> objektinis tipas
        int primitiveInt = 42;
        Integer wrappedInt = primitiveInt; // Autoboxing

        double primitiveDouble = 3.14;
        Double wrappedDouble = primitiveDouble; // Autoboxing

        // Demonstruojame autoboxing rezultatus
        System.out.println("Autoboxing:");
        System.out.println("primitiveInt: " + primitiveInt);
        System.out.println("wrappedInt: " + wrappedInt);
        System.out.println("primitiveDouble: " + primitiveDouble);
        System.out.println("wrappedDouble: " + wrappedDouble);

        // Unboxing: objektinis tipas -> primityvus tipas
        Integer wrappedInt2 = 123;
        int primitiveInt2 = wrappedInt2; // Unboxing

        Double wrappedDouble2 = 2.718;
        double primitiveDouble2 = wrappedDouble2; // Unboxing

        // Demonstruojame unboxing rezultatus
        System.out.println("\nUnboxing:");
        System.out.println("wrappedInt2: " + wrappedInt2);
        System.out.println("primitiveInt2: " + primitiveInt2);
        System.out.println("wrappedDouble2: " + wrappedDouble2);
        System.out.println("primitiveDouble2: " + primitiveDouble2);
    }
}
