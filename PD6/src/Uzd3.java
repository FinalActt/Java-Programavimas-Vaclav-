public class Uzd3 {
    public static void main(String[] args) {
        // Initial character array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};

        // Convert the character array to a string
        String resultString = charArrayToString(charArray);

        // Print the result
        System.out.println("Result: " + resultString);
    }

    // Method that converts a character array to a string
    public static String charArrayToString(char[] charArray) {
        // Create a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // Iterate through the character array and append each character to the StringBuilder
        for (char c : charArray) {
            stringBuilder.append(c);
        }

        // Return the resulting string
        return stringBuilder.toString();
    }
}
