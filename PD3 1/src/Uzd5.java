public class Uzd5 {
    public static void main(String[] args) {
        // int to double
        int intValue = 10;
        double doubleValue = (double) intValue;
        System.out.println("int to double: " + doubleValue);

        // long to int
        long longValue = 1000L;
        int intValueFromLong = (int) longValue;
        System.out.println("long to int: " + intValueFromLong);

        // double to int
        double doubleNumber = 15.67;
        int intValueFromDouble = (int) doubleNumber;
        System.out.println("double to int: " + intValueFromDouble);

        // char to int
        char charValue = 'A';
        int intValueFromChar = (int) charValue;
        System.out.println("char to int: " + intValueFromChar);
    }
}
