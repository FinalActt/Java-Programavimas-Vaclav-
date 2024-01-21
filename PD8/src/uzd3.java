public class uzd3
{
    public static String convertToHex(String text) {
        StringBuilder hexResult = new StringBuilder();

        for (char character : text.toCharArray()) {
            String hexValue = Integer.toHexString(character);
            hexResult.append(hexValue);
        }

        return hexResult.toString();
    }

    public static void main(String[] args) {
        String originalText = "Java is ...";
        String hexResult = convertToHex(originalText);

        System.out.println(hexResult);
    }
}